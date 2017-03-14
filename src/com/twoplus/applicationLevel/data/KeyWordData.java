/**
 * 
 */
package com.twoplus.applicationLevel.data;

import com.twoplus.espider.constant.Constants;

/**
 * @author Gavin
 *
 */
public class KeyWordData {
	
	/** Represents the id field */
	private String id;
	
	private String name;
	
	/** Represents the title field */
	private String title;
	
	private String selfUrl;
	
	private String volume;
	
	private String cpc;
	
	private String competitive;
	
	private String level;
	
	private String searched;
	
	private String createdDate;
	
	private String lastUpdateDate;
	
	private String enabled;
	
	/**
	* Creates a new GatherKeyWordDTO object.
	*/
	public KeyWordData() {
		id = Constants.EMPTY_STRING;
		title = Constants.EMPTY_STRING;
		name = Constants.EMPTY_STRING;
		selfUrl = Constants.EMPTY_STRING;
		volume = Constants.EMPTY_STRING;
		cpc = Constants.EMPTY_STRING;
		competitive = Constants.EMPTY_STRING;
		level = Constants.EMPTY_STRING;
		searched = Constants.EMPTY_STRING;
		createdDate = Constants.EMPTY_STRING;
		lastUpdateDate = Constants.EMPTY_STRING;
		enabled = Constants.EMPTY_STRING;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the selfUrl
	 */
	public String getSelfUrl() {
		return selfUrl;
	}

	/**
	 * @param selfUrl the selfUrl to set
	 */
	public void setSelfUrl(String selfUrl) {
		this.selfUrl = selfUrl;
	}

	/**
	 * @return the volume
	 */
	public String getVolume() {
		return volume;
	}

	/**
	 * @param volume the volume to set
	 */
	public void setVolume(String volume) {
		this.volume = volume;
	}

	/**
	 * @return the cpc
	 */
	public String getCpc() {
		return cpc;
	}

	/**
	 * @param cpc the cpc to set
	 */
	public void setCpc(String cpc) {
		this.cpc = cpc;
	}

	/**
	 * @return the competitive
	 */
	public String getCompetitive() {
		return competitive;
	}

	/**
	 * @param competitive the competitive to set
	 */
	public void setCompetitive(String competitive) {
		this.competitive = competitive;
	}

	/**
	 * @return the level
	 */
	public String getLevel() {
		return level;
	}

	/**
	 * @param level the level to set
	 */
	public void setLevel(String level) {
		this.level = level;
	}

	/**
	 * @return the searched
	 */
	public String getSearched() {
		return searched;
	}

	/**
	 * @param searched the searched to set
	 */
	public void setSearched(String searched) {
		this.searched = searched;
	}

	/**
	 * @return the createdDate
	 */
	public String getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * @return the lastUpdateDate
	 */
	public String getLastUpdateDate() {
		return lastUpdateDate;
	}

	/**
	 * @param lastUpdateDate the lastUpdateDate to set
	 */
	public void setLastUpdateDate(String lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	/**
	 * @return the enabled
	 */
	public String getEnabled() {
		return enabled;
	}

	/**
	 * @param enabled the enabled to set
	 */
	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}

}
