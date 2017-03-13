/**
 * Copyright (C) 2016 - 2017 YG Studio. All rights reserved.
 * Filename:  UserController.java
 * Purpose:   xxx
 * Classes:   UserController
 */
package com.twoplus.cms.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.twoplus.cms.data.webappfunction.DashBoardData;
import com.twoplus.cms.data.webappfunction.UserData;
import com.twoplus.cms.service.UserSvcIfc;
import com.twoplus.espider.constant.CMSConstants;

/**
 * This is used for xxx <BR>
 *
 * <PRE>
 *
 * <B>History:</B>
 * Developer            Date                 Change Reason        Change
 * ----------------     ----------------     ----------------     ----------------
 * Gavin.Zhang          Jan 24, 2017         Initial version      0.1
 *
 * </PRE>
 *
 * @author Gavin.Zhang - YG Studio
 *
 * @version 01.00.00
 *
 */

@Controller
@SessionAttributes("authorisedUser")
@RequestMapping(CMSConstants.URL_CMS + CMSConstants.SLASH + CMSConstants.URL_USER)
public class UserController {
	
	/** Represents the logger field */
	private static Log logger = LogFactory.getLog(UserController.class);
	
	@Resource
	private UserSvcIfc userSvc;
	
	@RequestMapping(value=CMSConstants.URL_LOGIN, method=RequestMethod.GET)
	public String login(@ModelAttribute("user") UserData userData) throws Exception {
		logger.debug(CMSConstants.URL_CMS + CMSConstants.SLASH + CMSConstants.URL_USER + CMSConstants.SLASH + CMSConstants.URL_LOGIN);
		
		return CMSConstants.PAGE_USER_SHOW_LOGIN;
	}
	
	@RequestMapping(value=CMSConstants.URL_DO_LOGIN, method=RequestMethod.POST)
    public String doLogin(@ModelAttribute("user")UserData userData, ModelMap userMap) throws Exception {
		logger.debug(CMSConstants.URL_CMS + CMSConstants.SLASH + CMSConstants.URL_USER + CMSConstants.SLASH + CMSConstants.URL_DO_LOGIN);
		
		boolean canLogin = userSvc.checkValidLigin(userData);
		
		if (canLogin) {
			
			userMap.addAttribute("authorisedUser", userData);
				
			return InternalResourceViewResolver.REDIRECT_URL_PREFIX + "/cms/user/dashboard" + CMSConstants.PAGE_DOT_DO;
		}
		
		return InternalResourceViewResolver.REDIRECT_URL_PREFIX + "/";
    }
	
	@RequestMapping(value=CMSConstants.URL_LOGOUT, method=RequestMethod.GET)
    public String logout(@ModelAttribute("authorisedUser")UserData userData, HttpSession httpSession) {
		
		httpSession.removeAttribute("authorisedUser");

		return InternalResourceViewResolver.REDIRECT_URL_PREFIX + "/";
    }
	
	@RequestMapping(value=CMSConstants.URL_DASHBOARD, method=RequestMethod.GET)
	public String gotoDashboard(@ModelAttribute("user")UserData userData, @ModelAttribute("board")DashBoardData dbData, ModelMap userMap) throws Exception {
		
		//dashBoardSvc.gatherDataForDashBoard(dbData);
		
		return CMSConstants.PAGE_USER_SHOW_DASHBOARD;
	}

}
