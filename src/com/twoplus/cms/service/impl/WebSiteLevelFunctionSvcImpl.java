/**
 * Copyright (C) 2016 YG Studio. All rights reserved.
 * Filename:  WebSiteLevelFunctionSvcImpl.java
 * Purpose:   xxx
 * Classes:   WebSiteLevelFunctionSvcImpl
 */
package com.twoplus.cms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.twoplus.cms.dao.DAOFacade;
import com.twoplus.cms.data.webappfunction.WebSiteData;
import com.twoplus.cms.data.webappfunction.WebSiteNginxLogData;
import com.twoplus.cms.service.WebSiteLevelFunctionSvcIfc;
import com.twoplus.espider.util.Utils;


/**
 * This is used for xxx <BR>
 *
 * <PRE>
 *
 * <B>History:</B>
 * Developer            Date                 Change Reason        Change
 * ----------------     ----------------     ----------------     ----------------
 * Gavin.Zhang          Dec 28, 2016              Initial version      0.1
 *
 * </PRE>
 *
 * @author Gavin.Zhang - YG Studio
 *
 * @version 01.00.00
 *
 */

public class WebSiteLevelFunctionSvcImpl extends CMSTopService implements WebSiteLevelFunctionSvcIfc {

	/** Represents the logger field */
	private static Log logger = LogFactory.getLog(WebSiteSvcImpl.class);
	
	//@Resource
	//private DAOFacade daoFacade;

	@Override
	public void doWSSiteMap(WebSiteData webSiteData) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void analysisNginxLogs(WebSiteNginxLogData webSiteNginxLogData)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	

	

}
