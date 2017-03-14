/**
 * 
 */
package com.twoplus.espider.gather.hotkeywords;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.twoplus.applicationLevel.dao.ApplicationDAOFacade;
import com.twoplus.applicationLevel.data.GatherDTO;
import com.twoplus.applicationLevel.data.KeyWordData;
import com.twoplus.espider.constant.Constants;
import com.twoplus.espider.util.Utils;

/**
 * @author GavinZhang
 *
 */
public class GatherHotKeyWordsFromTrends24 {
	
	@Resource
	private ApplicationDAOFacade applicationDaoFacade;
	
	public void gather() throws Exception {
		//Map<String, List<DTO>> resultMap = new HashMap<String, List<DTO>>();
		List<String> relatedsList = new ArrayList<String>();
		//List<DTO> allKeyWords = new ArrayList<DTO>();

		Document doc = Utils.getURLDoc("https://trends24.in/united-states/", Constants.USER_AGENT);
		
		Elements relateds = doc.getElementsByClass("trend-card__list");
		
		if (relateds != null) {
			relatedsList = getAllLinkText(relateds);
		}
		
		if (relatedsList.size() > 0) {
			GatherDTO gatherDTO = new GatherDTO();
			
			for (String kw : relatedsList) {
				if (!"".equals(kw) && !kw.contains("'") && Utils.isKeyWord(kw) && !Utils.hasSensitiveWords(kw)) {
					
					List<KeyWordData> gatherKWList = new ArrayList<KeyWordData>();
					
					KeyWordData kwData = new KeyWordData();
					String kwStr = kw;
					
					kwData.setName(kwStr.toLowerCase());
					kwData.setTitle(kwStr);
					kwData.setSelfUrl(Utils.getURL(kwData.getName()));
					
					gatherKWList.add(kwData);
					
					gatherDTO.setGatherKWList(gatherKWList);
					
					try {
						applicationDaoFacade.insertGatherKeyWordList(gatherDTO);
					} catch (Exception e) {
						continue;
					}
				}
			}
			
			/*if (gatherKWList.size() > 0) {
				gatherDTO.setGatherKWList(gatherKWList);
				applicationDaoFacade.insertGatherKeyWordList(gatherDTO);
			}*/
		}
		
		//storeInPool(relatedsList, allKeyWords, resultMap);
		
		//return resultMap;
	}
	
	protected List<String> getAllLinkText(Elements contents) {
		Elements aTags = contents.select("a");
		List<String> relatedKeyWords = new ArrayList<String>();
		
		for (Element a : aTags) {
			//String kw = Utils.formatTitle(a.attr("title"));
			String kw = a.text().replace("#", "");
			if (Utils.isOnlyEnglishNumber(kw) && !Utils.hasSensitiveWords(kw)) {
				relatedKeyWords.add(kw);
			}
	    }
		
		return relatedKeyWords;
	}

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws Exception {
		GatherHotKeyWordsFromTrends24 obj = new GatherHotKeyWordsFromTrends24();
		obj.gather();
	}

}
