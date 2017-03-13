/**
 * Copyright (C) 2016 GYG. All rights reserved.
 * Filename:  CacheFactory.java
 * Purpose:   xxx
 * Classes:   CacheFactory
 */
package com.twoplus.platform.factory;

import java.util.HashMap;
import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

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

public class CacheFactory {
	
	private static Log logger = LogFactory.getLog(CacheFactory.class);
	
	private Map<String, Map<String, Object>> cacheMap = new HashMap<String, Map<String, Object>>();
	
	public Map<String, Object> createCache(String cacheName) {
		Map<String, Object> map = new HashMap<String, Object>();
		cacheMap.put(cacheName, map);
		
		logger.debug("CacheFactory -- ");
		
		return map;
	}
	
	public boolean isExist(String cachName) {
		if(cacheMap.containsKey(cachName)) {
			return true;
		}
		
		return false;
	}
	
	public Map<String,Object> getMapByKey(String cachName) {
		if(cacheMap.containsKey(cachName)) {
			return cacheMap.get(cachName);
		}
		
		return null;
	}
	
	public boolean hasSubCache(String levelOneCacheName, String levelTwoCacheName) {
		if (cacheMap.containsKey(levelOneCacheName)) {
			if (cacheMap.get(levelOneCacheName).containsKey(levelTwoCacheName)) {
				return true;
			}
		}
		
		return false;
	}

}
