/**
 * Copyright (C) 2016 - 2017 YG Studio. All rights reserved.
 * Filename:  UserSvcImpl.java
 * Purpose:   xxx
 * Classes:   UserSvcImpl
 */
package com.twoplus.cms.service.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.twoplus.cms.controller.UserController;
import com.twoplus.cms.data.webappfunction.UserData;
import com.twoplus.cms.service.UserSvcIfc;

/**
 * This is used for xxx <BR>
 *
 * <PRE>
 *
 * <B>History:</B>
 * Developer            Date                 Change Reason        Change
 * ----------------     ----------------     ----------------     ----------------
 * Gavin.Zhang          Jan 24, 2017              Initial version      0.1
 *
 * </PRE>
 *
 * @author Gavin.Zhang - YG Studio
 *
 * @version 01.00.00
 *
 */

@Service("userSvc")
public class UserSvcImpl implements UserSvcIfc {
	
	/** Represents the logger field */
	private static Log logger = LogFactory.getLog(UserSvcImpl.class);
	
	/**
	 * @see com.twoplus.cms.service.UserSvcIfc#checkValidLigin(com.twoplus.cms.data.webappfunction.UserData)
	 *
	 */
	@Override
	public boolean checkValidLigin(UserData userData) throws Exception {
		boolean canLogin = false;
		
		if (userData.getName().equalsIgnoreCase("xxx") || userData.getName().equalsIgnoreCase("xxx")) {
			canLogin = true;
		}
		
		return canLogin;
	}
}
