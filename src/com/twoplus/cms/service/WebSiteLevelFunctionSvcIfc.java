/**
 * Copyright (C) 2016 YG Studio. All rights reserved.
 * Filename:  WebSiteLevelFunctionController.java
 * Purpose:   xxx
 * Classes:   WebSiteLevelFunctionController
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

public interface WebSiteLevelFunctionSvcIfc {
	
	public void doWSSiteMap(WebSiteData webSiteData) throws Exception;
	
	public void analysisNginxLogs(WebSiteNginxLogData webSiteNginxLogData) throws Exception;


}
