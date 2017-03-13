/**
 * Copyright (C) 2016 GYG. All rights reserved.
 * Filename:  WebSiteSvcIfc.java
 * Purpose:   xxx
 * Classes:   WebSiteSvcIfc
 */
package com.twoplus.cms.service;

import com.twoplus.cms.data.webappfunction.WebSiteData;
import com.twoplus.cms.data.webappfunction.WebSiteNginxLogData;

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

public interface WebSiteSvcIfc {
	
	/*
	
	public void deleteWebSite(WebSiteData webSiteData) throws Exception;
	
	public void updateWebSite(WebSiteData webSiteData) throws Exception;
	
	*/
	public void insertWebSite(WebSiteData webSiteData) throws Exception;
	
	public void getOneWebSite(WebSiteData webSiteData) throws Exception;
	
	public void getAllWebSite(WebSiteData webSiteData) throws Exception;
	
	
}
