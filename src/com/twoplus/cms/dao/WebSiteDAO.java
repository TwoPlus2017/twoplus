/**
 * Copyright (C) 2016 GYG. All rights reserved.
 * Filename:  WebSiteDAO.java
 * Purpose:   xxx
 * Classes:   WebSiteDAO
 */
package com.twoplus.cms.dao;

import java.util.List;

import com.twoplus.cms.data.webappfunction.WebSiteData;

/**
 * This is used for xxx <BR>
 *
 * <PRE>
 *
 * <B>History:</B>
 * Developer			Date			  	 Change Reason		  Change
 * ----------------     ----------------     ----------------     ---------------
 * Gavin.Zhang			Oct 11, 2016         Initial version      0.1
 *
 * </PRE>
 *
 * @author Gavin.Zhang - GYG
 *
 * @version 01.00.00
 *
 */

public interface WebSiteDAO {
		
/*	
	
	public void deleteWebSite(WebSiteData website) throws Exception;
	
	public void updateWebSite(WebSiteData website) throws Exception;
	
	*/
	public int insertWebSite(WebSiteData wsData) throws Exception;
	
	public List<WebSiteData> getAllWebSite() throws Exception;
	
	public WebSiteData getOneWebSite(String websiteId) throws Exception;

}
