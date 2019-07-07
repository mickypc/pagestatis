package cn.edu.cuc.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.edu.cuc.result.ResItem;

@RestController
public class HttpErrorController implements ErrorController {

	@Override
	public String getErrorPath() {
		// TODO Auto-generated method stub
		return "/error";
	}

	@RequestMapping(path = "/error" )
	public ResItem error(HttpServletRequest request, HttpServletResponse response){
		ResItem res = new ResItem();
		res.setHttpcode(response.getStatus());
		res.setErrcode(-1);
		//res.setErrmsg(response.get);
		return res;
	 }
}
