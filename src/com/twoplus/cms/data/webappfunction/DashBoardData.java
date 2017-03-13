/**
 * Copyright (C) 2016 - 2017 YG Studio. All rights reserved.
 * Filename:  DashBoardData.java
 * Purpose:   xxx
 * Classes:   DashBoardData
 */
package com.twoplus.cms.data.webappfunction;

import com.twoplus.espider.constant.Constants;

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

public class DashBoardData {
	
	/** Represents the toolsCounter field */
	private String toolsCounter;
	
	/** Represents the kwCounterToday field */
	private String kwCounterToday;
	
	/** Represents the kwCounterYesterday field */
	private String kwCounterYesterday;
	
	/**
	* Creates a new DashBoardData object.
	*/
	public DashBoardData() {
		toolsCounter = Constants.EMPTY_STRING;
	}

	/**
	 * Getter for the property toolsCounter.
	 * 
	 * @return The value for the toolsCounter.
	 */
	public String getToolsCounter() {
		return toolsCounter;
	}

	/**
	 * Setter for property toolsCounter.
	 *
	 * @param toolsCounter new value of property toolsCounter.
	 */
	public void setToolsCounter(String toolsCounter) {
		this.toolsCounter = toolsCounter;
	}

	/**
	 * Getter for the property kwCounterToday.
	 * 
	 * @return The value for the kwCounterToday.
	 */
	public String getKwCounterToday() {
		return kwCounterToday;
	}

	/**
	 * Setter for property kwCounterToday.
	 *
	 * @param kwCounterToday new value of property kwCounterToday.
	 */
	public void setKwCounterToday(String kwCounterToday) {
		this.kwCounterToday = kwCounterToday;
	}

	/**
	 * Getter for the property kwCounterYesterday.
	 * 
	 * @return The value for the kwCounterYesterday.
	 */
	public String getKwCounterYesterday() {
		return kwCounterYesterday;
	}

	/**
	 * Setter for property kwCounterYesterday.
	 *
	 * @param kwCounterYesterday new value of property kwCounterYesterday.
	 */
	public void setKwCounterYesterday(String kwCounterYesterday) {
		this.kwCounterYesterday = kwCounterYesterday;
	}

}
