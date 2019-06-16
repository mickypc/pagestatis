package cn.edu.cuc.pagestatis.model.uaa;

import java.util.*;
import nl.basjes.parse.useragent.*;

public class UaaUtils {
	static private UserAgentAnalyzer uaa = null;
	static private boolean inited = false;

	static private void init() {
		if (!inited) {
			uaa = UserAgentAnalyzer
				.newBuilder()
				.hideMatcherLoadStats()
				.withCache(10000)
				.build();
			inited = true;
		}
	}

	static public Map<String, Object> analyse(String agentstr) {
		Map<String, Object> resmap = new HashMap<String, Object>();
		UserAgent ua = parse(agentstr);
		for (String fieldName: ua.getAvailableFieldNames()) {
    	resmap.put(fieldName, ua.getValue(fieldName));
    }
    return resmap;
	}

	static public UserAgent parse(String agentstr) {
		init();
		return uaa.parse(agentstr);
	}

}