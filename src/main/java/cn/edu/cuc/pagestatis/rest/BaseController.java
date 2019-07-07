package cn.edu.cuc.pagestatis.rest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import cn.edu.cuc.context.Constants;

@RestController
public class BaseController {
	@Autowired
	protected HttpServletRequest httpreq;

	@Autowired
	protected HttpServletResponse httpres;

	protected Constants myConst = Constants.getInstance();
	
	protected String getRemoteIp() {
		String remoteip = "127.0.0.1";
		if (httpreq != null) {
			remoteip = httpreq.getRemoteAddr();
		}
		return remoteip;
	}
}
