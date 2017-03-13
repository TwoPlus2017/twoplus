/**
 * Copyright (C) 2016 GYG. All rights reserved.
 * Filename:  DAOFacade.java
 * Purpose:   xxx
 * Classes:   DAOFacade
 */
package com.twoplus.cms.dao;

import java.util.List;
import javax.annotation.Resource;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.twoplus.cms.data.webappfunction.WebSiteData;

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
public class DAOFacade {
	
	/** Represents the logger field */
	private static Log logger = LogFactory.getLog(DAOFacade.class);
	
	@Resource
	private WebSiteDAO webSiteDAO;
	@Resource
	private ArticleDAO articleDAO;
	
	/**
	* Creates a new DAOFacade object.
	*/
	public DAOFacade() {
		logger.debug("DAOFacade object had build...");
	}
	
	public List<WebSiteData> getAllWebSite() throws Exception {
		return webSiteDAO.getAllWebSite();
	}
	
	public WebSiteData getOneWebSite(String wsId) throws Exception {
		return webSiteDAO.getOneWebSite(wsId);
	}
	
	public int insertWebSite(WebSiteData wsData) throws Exception {
		return webSiteDAO.insertWebSite(wsData);
	}
	
	/*^------------------------------------------------------------------WebSite DAO Section --------------------------------------------------------------^*/
	
	public List<String> getAllArticlesURL(WebSiteData webSite) throws Exception {
		return articleDAO.getAllArticlesURL(webSite);
	}

}
