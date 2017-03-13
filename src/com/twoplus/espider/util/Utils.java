/**
 * Copyright (C) 2016 GYG. All rights reserved.
 * Filename:  Utils.java
 * Purpose:   xxx
 * Classes:   Utils
 */
package com.twoplus.espider.util;

import org.apache.commons.lang3.StringUtils;
import com.twoplus.espider.constant.Constants;


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

public class Utils {
	
	/**
	 * xxx 
	 *
	 * @param str
	 * @return
	 */
	public static boolean checkNotEmpty(String str) {
		if (!Constants.EMPTY_STRING.equals(str)) {
			return true;
		}
		
		return false;
	}
	
	/**
	 * xxx 
	 *
	 * @param str
	 * @return
	 */
	public static boolean isEmpty(String str) {
		return StringUtils.isEmpty(str);
	}
	
	
	/**
	 * xxx 
	 *
	 * @param object
	 * @return
	 */
	public static boolean checkNotNull(Object object) {
		if (object != null) {
			return true;
		}
		
		return false;
	}
	
	/**
	 * xxx 
	 *
	 * @param object
	 * @return
	 */
	public static boolean isNull(Object object) {
		if (object == null) {
			return true;
		}
		
		return false;
	}
	
	/**
	 * xxx 
	 *
	 * @param mixNum
	 * @param maxNum
	 * @return
	 */
	public static int getRandomNum(int mixNum, int maxNum) {
		return (int)(mixNum + Math.random() * (maxNum - mixNum + 1));
	}
	
	/**
	 * xxx 
	 *
	 * @param mixNum
	 * @param maxNum
	 * @return
	 */
	public static String getRandomNumStr(int mixNum, int maxNum) {
		return String.valueOf(getRandomNum(mixNum, maxNum));
	}

}
