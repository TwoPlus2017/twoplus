/**
 * Copyright (C) 2016 GYG. All rights reserved.
 * Filename:  WebSiteController.java
 * Purpose:   xxx
 * Classes:   WebSiteController
 */
package com.twoplus.cms.controller;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.twoplus.cms.data.webappfunction.WebSiteData;
import com.twoplus.cms.data.webappfunction.WebSiteNginxLogData;
import com.twoplus.cms.service.WebSiteLevelFunctionSvcIfc;
import com.twoplus.espider.constant.CMSConstants;

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

@Controller
@RequestMapping(CMSConstants.URL_CMS + CMSConstants.SLASH + CMSConstants.URL_WEBSITE_LEVEL_FUNCTION)
public class WebSiteLevelFunctionController {
	
	private static Log logger = LogFactory.getLog(WebSiteLevelFunctionController.class);
	
	/*@Resource
	private WebSiteLevelFunctionSvcIfc webSiteLevelFuncSvc;
	
	@RequestMapping(value=CMSConstants.URL_DO_WEBSITE_SITEMAP, method=RequestMethod.GET)
	public String doWSSiteMapAction(@ModelAttribute("webSite")WebSiteData webSiteData) throws Exception {
		logger.debug(CMSConstants.URL_CMS + CMSConstants.SLASH + CMSConstants.URL_WEBSITE_LEVEL_FUNCTION + CMSConstants.SLASH + CMSConstants.URL_DO_WEBSITE_SITEMAP);
		
		webSiteLevelFuncSvc.doWSSiteMap(webSiteData);
		
		return "";
	}
	
	@RequestMapping(value=CMSConstants.URL_ANALYSIS_NGINX_LOGS, method=RequestMethod.GET)
	public String analysisNginxLogs(@ModelAttribute("webSiteNginxLogData")WebSiteNginxLogData webSiteNginxLogData) throws Exception {
		logger.debug(CMSConstants.URL_CMS + CMSConstants.SLASH + CMSConstants.URL_WEBSITE + CMSConstants.SLASH + CMSConstants.URL_ANALYSIS_NGINX_LOGS);
		
		webSiteLevelFuncSvc.analysisNginxLogs(webSiteNginxLogData);
		
		return "";
	}*/

}
