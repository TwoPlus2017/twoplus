/**
 * Copyright (C) 2016 - 2017 GB Studio. All rights reserved.
 * Filename:  DAOFacade.java
 * Purpose:   The SWSB facade DAO object and include all SWSB application components DAO functions.
 * Classes:   DAOFacade
 */
package com.twoplus.applicationLevel.dao;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.twoplus.applicationLevel.data.GatherDTO;


/**
 * The SWSB facade DAO object and include all SWSB application components DAO functions. <BR>
 *
 * <PRE>
 *
 * <B>History:</B>
 * Developer            Date                 Change Reason        Change
 * ----------------     ----------------     ----------------     ----------------
 * Gavin.Zhang          Nov 9, 2016          Initial version      0.1
 *
 * </PRE>
 *
 * @author Gavin.Zhang - GB Studio
 *
 * @version 01.00.00
 *
 */

public class ApplicationDAOFacade {
	
	/** Represents the logger field */
	private static Log logger = LogFactory.getLog(ApplicationDAOFacade.class);
	
	@Resource
	private GatherKWDAO gatherKWDAO;
	
	/**
	 * Get all sensitive words from DB.   
	 *
	 * @return
	 * @throws Exception
	 */
	public void insertGatherKeyWordList(GatherDTO gatherDTO) throws Exception {
		logger.debug("DAOFacade --> getAllSensitiveWordsList()");
		
		gatherKWDAO.insertGatherKeyWordList(gatherDTO);
	}
	
	public void deleteHotKeyWordsFromTable() throws Exception {
		logger.debug("DAOFacade --> deleteHotKeyWordsFromTable()");
		
		gatherKWDAO.deleteHotKeyWordsFromTable();
		
	}
	/*^------ Application Level DAO -----------------------------------------------------------------------------------------------------------------^*/
	

}
