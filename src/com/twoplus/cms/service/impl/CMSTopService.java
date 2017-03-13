/**
 * Copyright (C) 2016 GYG. All rights reserved.
 * Filename:  CMSTopService.java
 * Purpose:   xxx
 * Classes:   CMSTopService
 */
package com.twoplus.cms.service.impl;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.twoplus.cms.dao.DAOFacade;
import com.twoplus.cms.data.webappfunction.WebSiteData;
import com.twoplus.platform.factory.CacheFactory;


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

public abstract class CMSTopService {
	
	/** Represents the logger field */
	private static Log logger = LogFactory.getLog(CMSTopService.class);
	
	@Resource
	protected CacheFactory cacheFactory;
	@Resource
	protected DAOFacade daoFacade;
	
	/**
	 * xxx 
	 *
	 * @param webSiteShowName
	 * @return
	 */
	protected WebSiteData getWebSiteObjectByShowName(String webSiteShowName) {
		logger.debug("NicheTopService ----> getWebSiteObjectByShowName()");
		
		return (WebSiteData)cacheFactory.getMapByKey("webSiteMapByShowName").get(webSiteShowName);
	}

}
