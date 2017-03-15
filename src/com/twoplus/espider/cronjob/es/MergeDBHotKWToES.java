/**
 * 
 */
package com.twoplus.espider.cronjob.es;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import com.twoplus.applicationLevel.dao.ApplicationDAOFacade;
import com.twoplus.espider.util.Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Date;


/**
 * @author GavinZhang
 *
 */
public class MergeDBHotKWToES {
	
	@Resource
	private ApplicationDAOFacade applicationDaoFacade;
	
	public String dbUrl = "jdbc:mysql://127.0.0.1:3308/xxx?user=xxx&password=xxxx&useUnicode=true&characterEncoding=UTF8";
	
	
	
	public void merge() throws Exception {
		fillPool();
		
		//TODO: merge DB Hot KeyWord table to DB each KeyWord tables;
		mergeDB();
		
		//TODO: merge DB each KeyWord tables to ES
		
		// update DB Hot KeyWord table
		deleteHotKeyWordsFromDB();
	}
	
	public void mergeDB() throws Exception {
		pickKWFromDBAndFillInToEachBuffer();
		
		batchInsertIntoDB();
	}
	
	private void batchInsertIntoDB() {
		System.out.println("Start insert actions.................................................................");
		
		for (String tableName : allMapPool.keySet()) {
			Set<String> oneSet = allMapPool.get(tableName);
			//System.out.println(tableName + "\t" + oneSet.size());
            StringBuilder waveInsertSQL = new StringBuilder();
            int counter = 0;
            
            for (String kw : oneSet) {
            	if (!"".equals(kw)) {
                    String name = kw.toLowerCase();
                    String title = kw;
                    String selfUrl = Utils.getURL(kw);
                    
                    waveInsertSQL.append("insert into " + tableName + "(name, title, self_url, created_date, last_update_date, enabled) values ('" + name + "', '" + title + "', '" + selfUrl + "', now(), now(), 0);");
                   
                    counter++;
                }
            	
            	if (counter == 1000) {
            		try {
                        insertDB(waveInsertSQL, tableName);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                        continue;
                    }
                    
                    waveInsertSQL = new StringBuilder();
                    counter = 0;
            	}
            }
            
            if (counter >= 1) {
                // do insert
                try {
                    
                    insertDB(waveInsertSQL, tableName);
                    
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    continue;
                }
            }
		}
		
		System.out.println("End insert actions.................................................................");
		
	}
	
	public void insertDB(StringBuilder waveInsertSQL, String tableName) throws Exception {
        Long begin = new Date().getTime();
        
        String[] allSql = waveInsertSQL.toString().split(";");
        int counter = 0;
        
        Connection insertConn = null;
        java.sql.PreparedStatement insertPS = null;
        
        Class.forName("com.mysql.jdbc.Driver");
        insertConn = DriverManager.getConnection(dbUrl);
        insertConn.setAutoCommit(false);
        
        insertPS = insertConn.prepareStatement("");
        
        for (String sql : allSql) {
        	
        	try {
        		 insertPS.addBatch(sql);
                 
                 insertPS.executeBatch();
                 
                 insertConn.commit();
                 
                 counter++;
                 
        	} catch (Exception e) {
        		continue;
        	}
        }
        
        if (null != insertPS) {
            insertPS.close();
        }
        
        if (null != insertConn) {
            insertConn.close();
        }
        
        Long end = new Date().getTime();
        
        if (counter > 0) {
        	System.out.println("Using : " + (end - begin) / 1000 + " ms and insert counter is (" + counter + ") for ----> " + tableName);
        }
    }

	public void pickKWFromDBAndFillInToEachBuffer() throws Exception {
		
		String selectHotKWSql = "select NAME, TITLE, SELF_URL from SWSBT_KW_HOT;";
		String name = "";
        String title = "";
        String selfUrl = "";
        String firstLetter = "";
        int counter = 0;
		
		Connection selectConn = null;
        ResultSet rs = null;
        java.sql.PreparedStatement selectPS = null;
        
        
        if (selectConn == null || selectConn.isClosed()) {
            Class.forName("com.mysql.jdbc.Driver");
            selectConn = DriverManager.getConnection(dbUrl);
        }
        
        selectPS = selectConn.prepareStatement(selectHotKWSql);
        
        rs = selectPS.executeQuery();
        
        while (rs.next()) {
        	name = rs.getString(1);
        	title = rs.getString(2);
        	selfUrl = rs.getString(3);
        	
        	if (name != null && title != null && selfUrl != null) {
        		firstLetter = name.substring(0, 1);
        		
        		if (firstLetter != "") {
                    allMapPool.get(tableNamePool.get(firstLetter)).add(title);
                    
                    counter += 1;
                }
        	}
        }
        
        System.out.println("Done for selected new Hot KW (" + counter + ")");
        
        try {
        	if (null != rs) {
            	rs.close();
            }
            
            if (null != selectPS) {
            	selectPS.close();
            }
            
            if (null != selectConn) {
            	selectConn.close();
            }
        } catch (Exception e) {
        	
        }
        
        
        //for (String tableName : tableNamePool.keySet()) {
        	//System.out.println(tableNamePool.get(tableName) + "\t has new keywords counter ------------> " + allMapPool.get(tableNamePool.get(tableName)).size());
        //}
	}
	
	public void deleteHotKeyWordsFromDB() throws Exception {
		applicationDaoFacade.deleteHotKeyWordsFromTable();
	}
	
	public static Map<String, String> tableNamePool = new HashMap<String, String>();
    public static Map<String, Set> allMapPool = new HashMap<String, Set>();
    
    public static Set SWSBT_KW_A = new HashSet();
    public static Set SWSBT_KW_B = new HashSet();
    public static Set SWSBT_KW_C = new HashSet();
    public static Set SWSBT_KW_D = new HashSet();
    public static Set SWSBT_KW_E = new HashSet();
    public static Set SWSBT_KW_F = new HashSet();
    public static Set SWSBT_KW_G = new HashSet();
    public static Set SWSBT_KW_H = new HashSet();
    public static Set SWSBT_KW_I = new HashSet();
    public static Set SWSBT_KW_J = new HashSet();
    public static Set SWSBT_KW_K = new HashSet();
    public static Set SWSBT_KW_L = new HashSet();
    public static Set SWSBT_KW_M = new HashSet();
    public static Set SWSBT_KW_N = new HashSet();
    public static Set SWSBT_KW_O = new HashSet();
    public static Set SWSBT_KW_P = new HashSet();
    public static Set SWSBT_KW_Q = new HashSet();
    public static Set SWSBT_KW_R = new HashSet();
    public static Set SWSBT_KW_S = new HashSet();
    public static Set SWSBT_KW_T = new HashSet();
    public static Set SWSBT_KW_U = new HashSet();
    public static Set SWSBT_KW_V = new HashSet();
    public static Set SWSBT_KW_W = new HashSet();
    public static Set SWSBT_KW_X = new HashSet();
    public static Set SWSBT_KW_Y = new HashSet();
    public static Set SWSBT_KW_Z = new HashSet();
    public static Set SWSBT_KW_09 = new HashSet();
	
	public static void fillPool() {
        tableNamePool.put("a", "SWSBT_KW_A");
        tableNamePool.put("b", "SWSBT_KW_B");
        tableNamePool.put("c", "SWSBT_KW_C");
        tableNamePool.put("d", "SWSBT_KW_D");
        tableNamePool.put("e", "SWSBT_KW_E");
        tableNamePool.put("f", "SWSBT_KW_F");
        tableNamePool.put("g", "SWSBT_KW_G");
        tableNamePool.put("h", "SWSBT_KW_H");
        tableNamePool.put("i", "SWSBT_KW_I");
        tableNamePool.put("j", "SWSBT_KW_J");
        tableNamePool.put("k", "SWSBT_KW_K");
        tableNamePool.put("l", "SWSBT_KW_L");
        tableNamePool.put("m", "SWSBT_KW_M");
        tableNamePool.put("n", "SWSBT_KW_N");
        tableNamePool.put("o", "SWSBT_KW_O");
        tableNamePool.put("p", "SWSBT_KW_P");
        tableNamePool.put("q", "SWSBT_KW_Q");
        tableNamePool.put("r", "SWSBT_KW_R");
        tableNamePool.put("s", "SWSBT_KW_S");
        tableNamePool.put("t", "SWSBT_KW_T");
        tableNamePool.put("u", "SWSBT_KW_U");
        tableNamePool.put("v", "SWSBT_KW_V");
        tableNamePool.put("w", "SWSBT_KW_W");
        tableNamePool.put("x", "SWSBT_KW_X");
        tableNamePool.put("y", "SWSBT_KW_Y");
        tableNamePool.put("z", "SWSBT_KW_Z");
        tableNamePool.put("0", "SWSBT_KW_09");
        tableNamePool.put("1", "SWSBT_KW_09");
        tableNamePool.put("2", "SWSBT_KW_09");
        tableNamePool.put("3", "SWSBT_KW_09");
        tableNamePool.put("4", "SWSBT_KW_09");
        tableNamePool.put("5", "SWSBT_KW_09");
        tableNamePool.put("6", "SWSBT_KW_09");
        tableNamePool.put("7", "SWSBT_KW_09");
        tableNamePool.put("8", "SWSBT_KW_09");
        tableNamePool.put("9", "SWSBT_KW_09");
        
        allMapPool.put("SWSBT_KW_A", SWSBT_KW_A);
        allMapPool.put("SWSBT_KW_B", SWSBT_KW_B);
        allMapPool.put("SWSBT_KW_C", SWSBT_KW_C);
        allMapPool.put("SWSBT_KW_D", SWSBT_KW_D);
        allMapPool.put("SWSBT_KW_E", SWSBT_KW_E);
        allMapPool.put("SWSBT_KW_F", SWSBT_KW_F);
        allMapPool.put("SWSBT_KW_G", SWSBT_KW_G);
        allMapPool.put("SWSBT_KW_H", SWSBT_KW_H);
        allMapPool.put("SWSBT_KW_I", SWSBT_KW_I);
        allMapPool.put("SWSBT_KW_J", SWSBT_KW_J);
        allMapPool.put("SWSBT_KW_K", SWSBT_KW_K);
        allMapPool.put("SWSBT_KW_L", SWSBT_KW_L);
        allMapPool.put("SWSBT_KW_M", SWSBT_KW_M);
        allMapPool.put("SWSBT_KW_N", SWSBT_KW_N);
        allMapPool.put("SWSBT_KW_O", SWSBT_KW_O);
        allMapPool.put("SWSBT_KW_P", SWSBT_KW_P);
        allMapPool.put("SWSBT_KW_Q", SWSBT_KW_Q);
        allMapPool.put("SWSBT_KW_R", SWSBT_KW_R);
        allMapPool.put("SWSBT_KW_S", SWSBT_KW_S);
        allMapPool.put("SWSBT_KW_T", SWSBT_KW_T);
        allMapPool.put("SWSBT_KW_U", SWSBT_KW_U);
        allMapPool.put("SWSBT_KW_V", SWSBT_KW_V);
        allMapPool.put("SWSBT_KW_W", SWSBT_KW_W);
        allMapPool.put("SWSBT_KW_X", SWSBT_KW_X);
        allMapPool.put("SWSBT_KW_Y", SWSBT_KW_Y);
        allMapPool.put("SWSBT_KW_Z", SWSBT_KW_Z);
        allMapPool.put("SWSBT_KW_09", SWSBT_KW_09);
    }
	
	
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws Exception {
		MergeDBHotKWToES obj = new MergeDBHotKWToES();
		obj.merge();
	}
	

}
