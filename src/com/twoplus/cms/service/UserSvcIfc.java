/**
 * Copyright (C) 2016 - 2017 YG Studio. All rights reserved.
 * Filename:  UserSvcIfc.java
 * Purpose:   xxx
 * Classes:   UserSvcIfc
 */
package com.twoplus.cms.service;

import com.twoplus.cms.data.webappfunction.UserData;

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

public interface UserSvcIfc {
	
	public boolean checkValidLigin(UserData userData) throws Exception;

}
