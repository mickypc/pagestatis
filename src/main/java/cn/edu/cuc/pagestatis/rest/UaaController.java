package cn.edu.cuc.pagestatis.rest;

import java.util.*;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import javax.servlet.http.*;
import nl.basjes.parse.useragent.*;

import cn.edu.cuc.pagestatis.model.uaa.*;
import cn.edu.cuc.context.Constants;

@RestController
public class UaaController extends BaseController {
	@RequestMapping("/rest/uaa/test")
	public Map<String, Object> test() {
		String ua = httpreq == null ? "" : httpreq.getHeader("user-agent");
		myConst.getLogger().info("agent:{}", ua);
		Map<String, Object> resmap = UaaUtils.analyse(ua);
		return resmap;
	}

	@RequestMapping("/rest/uaa/analyse")
	public Map<String, Object> analyse(@RequestParam(value="agent", defaultValue="") String agent) {
		Map<String, Object> resmap = UaaUtils.analyse(agent);
		return resmap;
	}
}