/**
 * Copyright (C) 2016 GYG. All rights reserved.
 * Filename:  InitLiveWebSiteListener.java
 * Purpose:   xxx
 * Classes:   InitLiveWebSiteListener
 */
package com.twoplus.platform.listener;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.ServletContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.web.context.ServletContextAware;

import com.twoplus.cms.dao.DAOFacade;
import com.twoplus.cms.data.webappfunction.WebSiteData;
import com.twoplus.espider.constant.CMSConstants;
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

public class InitLiveWebSiteListener implements InitializingBean, ServletContextAware {
	
	/** Represents the logger field */
	private static Log logger = LogFactory.getLog(InitLiveWebSiteListener.class);
	
	//@Resource
	//private CacheFactory cacheFactory;
	//@Resource
	//private DAOFacade daoFacade;

	/**
	 * @see org.springframework.web.context.ServletContextAware#setServletContext(javax.servlet.ServletContext)
	 *
	 */
	@Override
	public void setServletContext(ServletContext servletContext) {
		/*logger.debug("InitLiveWebSiteListener ----> setServletContext");
		
		List<WebSiteData> webSites = new ArrayList<WebSiteData>();
		
		try {
			
			buildNicheWebSiteData(webSites);
			
		} catch (Exception e) {
			logger.error("InitLiveWebSiteListener ----> setServletContext " + e.getMessage());
		}
		
		if (webSites.size() > 0) {
			Map<String, Object> webSiteMapById = cacheFactory.createCache("webSiteMapById");
			Map<String, Object> webSiteMapByShowName = cacheFactory.createCache("webSiteMapByShowName");
			
			for (WebSiteData aData : webSites) {
				webSiteMapById.put(aData.getId(), aData);
				webSiteMapByShowName.put(aData.getShowName(), aData);
			}
		}*/
	}
	
	private void buildNicheWebSiteData(List<WebSiteData> webSite) throws Exception {
		/*List<WebSiteData> tempWebSite = new ArrayList<WebSiteData>();
		
		tempWebSite = daoFacade.getAllWebSite();
		
		for (WebSiteData aData : tempWebSite) {
			
			
			webSite.add(aData);
		}*/
	}

	/**
	 * @see org.springframework.beans.factory.InitializingBean#afterPropertiesSet()
	 *
	 */
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
	}
	

}
