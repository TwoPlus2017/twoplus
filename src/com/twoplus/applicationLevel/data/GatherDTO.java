/**
 * 
 */
package com.twoplus.applicationLevel.data;

import java.util.List;

/**
 * @author GavinZhang
 *
 */
public class GatherDTO {
	
	private List<KeyWordData> gatherKWList;
	
	public GatherDTO () {
		gatherKWList = null;
	}

	public List<KeyWordData> getGatherKWList() {
		return gatherKWList;
	}

	public void setGatherKWList(List<KeyWordData> gatherKWList) {
		this.gatherKWList = gatherKWList;
	}

}
