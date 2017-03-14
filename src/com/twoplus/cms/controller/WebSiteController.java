/**
 * Copyright (C) 2016 YG Studio. All rights reserved.
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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.twoplus.cms.data.webappfunction.WebSiteData;
import com.twoplus.cms.service.WebSiteSvcIfc;
import com.twoplus.espider.constant.CMSConstants;

/**
 * This is used for xxx <BR>
 *
 * <PRE>
 *
 * <B>History:</B>
 * Developer            Date                 Change Reason        Change
 * ----------------     ----------------     ----------------     ----------------
 * Gavin.Zhang          Dec 28, 2016         Initial version      0.1
 *
 * </PRE>
 *
 * @author Gavin.Zhang - YG Studio
 *
 * @version 01.00.00
 *
 */

@Controller
@RequestMapping(CMSConstants.URL_CMS + CMSConstants.SLASH + CMSConstants.URL_WEBSITE)
public class WebSiteController {
	
	private static Log logger = LogFactory.getLog(WebSiteController.class);
	
	/*@Resource
	private WebSiteSvcIfc webSiteSvc;
	
	@RequestMapping(value=CMSConstants.URL_VIEW_ALL_WEBSITE, method=RequestMethod.GET)
	public String viewAllWebSite(@ModelAttribute("webSite")WebSiteData webSiteData) throws Exception {
		logger.debug(CMSConstants.URL_CMS + CMSConstants.SLASH + CMSConstants.URL_WEBSITE + CMSConstants.SLASH + CMSConstants.URL_VIEW_ALL_WEBSITE);
		
		webSiteSvc.getAllWebSite(webSiteData);
		
		return CMSConstants.PAGE_VIEW_ALL_WEBSITE;
	}
	
	@RequestMapping(value=CMSConstants.URL_SHOW_FORM, method=RequestMethod.GET)
    public String showForm(@ModelAttribute("webSite")WebSiteData webSiteData) {
		logger.debug(CMSConstants.URL_CMS + CMSConstants.SLASH + CMSConstants.URL_WEBSITE + CMSConstants.SLASH + CMSConstants.URL_SHOW_FORM);
		
        return CMSConstants.PAGE_SHOW_ADD_FORM_WEBSITE;
    }
	
	@RequestMapping(value=CMSConstants.URL_VIEW_ONE_WEBSITE, method=RequestMethod.GET)
	public String viewOneWebSite(@ModelAttribute("webSite")WebSiteData webSiteData) throws Exception {
		logger.debug(CMSConstants.URL_CMS + CMSConstants.SLASH + CMSConstants.URL_WEBSITE + CMSConstants.SLASH + CMSConstants.URL_VIEW_ONE_WEBSITE);
		
		webSiteSvc.getOneWebSite(webSiteData);
		
		return CMSConstants.PAGE_VIEW_ONE_WEBSITE;
	}
	
	@RequestMapping(value=CMSConstants.URL_ADD_WEBSITE, method=RequestMethod.POST)
    public String addWebSite(@ModelAttribute("webSite")WebSiteData webSiteData, final RedirectAttributes redirectAttributes) throws Exception {
		logger.debug(CMSConstants.URL_CMS + CMSConstants.SLASH + CMSConstants.URL_WEBSITE + CMSConstants.SLASH + CMSConstants.URL_ADD_WEBSITE);
		
		webSiteSvc.insertWebSite(webSiteData);
        
        return CMSConstants.PAGE_VIEW_ONE_WEBSITE;
    }*/

}
