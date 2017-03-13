/**
 * Copyright (C) 2016 GYG. All rights reserved.
 * Filename:  WebSiteSvcImpl.java
 * Purpose:   xxx
 * Classes:   WebSiteSvcImpl
 */
package com.twoplus.cms.service.impl;

import org.springframework.stereotype.Service;

import com.twoplus.cms.data.webappfunction.WebSiteData;
import com.twoplus.cms.service.WebSiteSvcIfc;


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

@Service("webSiteSvc")
public class WebSiteSvcImpl extends CMSTopService implements WebSiteSvcIfc {

	@Override
	public void getAllWebSite(WebSiteData webSiteData) throws Exception {
		webSiteData.setWebSiteList(daoFacade.getAllWebSite());		
	}

	@Override
	public void getOneWebSite(WebSiteData webSiteData) throws Exception {
		webSiteData.setDbWebSiteData(daoFacade.getOneWebSite(webSiteData.getId()));
	}

	@Override
	public void insertWebSite(WebSiteData webSiteData) throws Exception {
		int wsId = daoFacade.insertWebSite(webSiteData);
		webSiteData.setId(String.valueOf(wsId));
		
		getOneWebSite(webSiteData);
	}

}
