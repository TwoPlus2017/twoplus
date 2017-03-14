/**
 * Copyright (C) 2016 GYG. All rights reserved.
 * Filename:  Utils.java
 * Purpose:   xxx
 * Classes:   Utils
 */
package com.twoplus.espider.util;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import com.twoplus.espider.constant.Constants;
import com.twoplus.espider.constant.RemoveLinkConstants;


/**
 * This is used for xxx <BR>
 *
 * <PRE>
 *
 * <B>History:</B>
 * Developer			Date			  	 Change Reason		  Change
 * ----------------     ----------------     ----------------     ---------------
 * Gavin.Zhang			Oct 21, 2016         Initial version      0.1
 *
 * </PRE>
 *
 * @author Gavin.Zhang - GYG
 *
 * @version 01.00.00
 *
 */

public class Utils {
	
	public static Document getURLDoc(String url, String userAgent) throws IOException {
		Connection conn = Jsoup.connect(url).timeout(Constants.GATHER_TIME_OUT);
		if (!userAgent.equals(Constants.EMPTY_STRING)) {
			conn.userAgent(userAgent);
		}
		Document doc = null;
		doc = conn.get();
		return doc;
	}
	
	public static boolean isOnlyEnglishNumber(String str) {
		boolean flg = true;
		
		Matcher matcher = Pattern.compile("(?i)[^a-zA-Z0-9\\ \\']").matcher(str);
		
		if (matcher.find()) {
			flg = false;
		}
		
		return flg;
	}
	
	public static boolean isKeyWord(String resource) {
		boolean is = false;
		
		if (resource.length() > 6 && resource.length() < 80 && resource.contains(" ") && !isWebSiteName(resource)) {
			is = true;
		}
		
		return is;
	}
	
	public static boolean isWebSiteName(String resource) {
		if (resource.contains("httpwww") || resource.contains("http") || resource.contains("https") || 
				resource.contains("www") || resource.contains(".com")) {
			
			return true;
		}
		
		return false;
	}
	
	public static boolean hasSensitiveWords(String resourceWords) {
		boolean hasSensitiveWords = false;
		
		if (hasCopyRightWord(resourceWords) || hasSexWord(resourceWords) || hasNeedRemovedLink(resourceWords)) {
			
			hasSensitiveWords = true;
		}
		
		return hasSensitiveWords;
	}
	
	public static boolean keywordHasSensitiveWords(String resourceWords) {
		boolean hasSensitiveWords = false;
		
		if (hasCopyRightWord(resourceWords) || hasSexWord(resourceWords)) {
			
			hasSensitiveWords = true;
		}
		
		return hasSensitiveWords;
	}
	
	public static boolean hasCopyRightWord(String resourceWords) {
		boolean hasCopyRightWord = false;
		
		if (StringUtils.indexOfAny(resourceWords.toLowerCase(), Constants.copyrightWords) >= 0) {
			hasCopyRightWord = true;
		}
		
		return hasCopyRightWord;
	}
	
	public static boolean hasSexWord(String resourceWords) {
		boolean hasSexword = false;
		
		if (StringUtils.indexOfAny(resourceWords.toLowerCase(), Constants.sexWords) >= 0) {
			hasSexword = true;
		}
		
		return hasSexword;
	}
	
	public static boolean hasNeedRemovedLink(String link) {
		boolean needRemove = false;
		
		if (StringUtils.indexOfAny(link.toLowerCase(), RemoveLinkConstants.removedLinks) >= 0) {
			needRemove = true;
		}
		
		return needRemove;
	}
	
	public static String formatTitle(String source) {
		if (Constants.EMPTY_STRING.equals(source)) {
			return Constants.EMPTY_STRING;
		}
		
		String temp = source;
		
		temp = temp.replaceAll(" {2,}", " ");

		//temp = setFirstLetterAsUpperForTitle(temp);
		
		return temp.trim();
	}
	
	public static final String setFirstLetterAsUpperForTitle(String aValue) {
    	String slValue = Constants.EMPTY_STRING;
    	String returnTitle = Constants.EMPTY_STRING;
    	String aWord = Constants.EMPTY_STRING;
    	int iLLength = 0;
    	
    	String[] allWords = aValue.trim().split(" ");
    	
    	if (allWords.length > 0) {
    		for (int i = 0; i < allWords.length; i++) {
    			aWord = allWords[i];
    			
    			char[] allChar = aWord.trim().toCharArray();
    			
    			iLLength = allChar.length;
    			
    			for (int j = 0; j < iLLength; j++) {
    	    		if (j == 0) {
    	    			slValue += String.valueOf(allChar[j]).toUpperCase();
    	    		} else {
    	    			slValue += String.valueOf(allChar[j]).toLowerCase();
    	    		}
    	    	}
    			
    			returnTitle += slValue + " ";
    			slValue = Constants.EMPTY_STRING;
        	}
    	}
    	
    	return returnTitle.trim();
    }
	
	public static String getURL(String source) {
		String temp = source;
		
		temp = temp.replaceAll(" {2,}", " ");
		temp = temp.replaceAll("(?i)[^a-zA-Z0-9\\ ]", "").trim();
		temp = temp.replaceAll(" {2,}", " ");
		temp = temp.toLowerCase().replace(" ", "-");
		
		return temp.trim();
	}
	
	
	/**
	 * xxx 
	 *
	 * @param str
	 * @return
	 */
	public static boolean checkNotEmpty(String str) {
		if (!Constants.EMPTY_STRING.equals(str)) {
			return true;
		}
		
		return false;
	}
	
	/**
	 * xxx 
	 *
	 * @param str
	 * @return
	 */
	public static boolean isEmpty(String str) {
		return StringUtils.isEmpty(str);
	}
	
	
	/**
	 * xxx 
	 *
	 * @param object
	 * @return
	 */
	public static boolean checkNotNull(Object object) {
		if (object != null) {
			return true;
		}
		
		return false;
	}
	
	/**
	 * xxx 
	 *
	 * @param object
	 * @return
	 */
	public static boolean isNull(Object object) {
		if (object == null) {
			return true;
		}
		
		return false;
	}
	
	/**
	 * xxx 
	 *
	 * @param mixNum
	 * @param maxNum
	 * @return
	 */
	public static int getRandomNum(int mixNum, int maxNum) {
		return (int)(mixNum + Math.random() * (maxNum - mixNum + 1));
	}
	
	/**
	 * xxx 
	 *
	 * @param mixNum
	 * @param maxNum
	 * @return
	 */
	public static String getRandomNumStr(int mixNum, int maxNum) {
		return String.valueOf(getRandomNum(mixNum, maxNum));
	}

}
