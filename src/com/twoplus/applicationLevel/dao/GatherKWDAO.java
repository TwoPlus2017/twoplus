/**
 * 
 */
package com.twoplus.applicationLevel.dao;

import com.twoplus.applicationLevel.data.GatherDTO;

/**
 * @author GavinZhang
 *
 */
public interface GatherKWDAO {
	
	public void insertGatherKeyWordList(GatherDTO gatherDTO) throws Exception;
	
	public void deleteHotKeyWordsFromTable() throws Exception;

}
