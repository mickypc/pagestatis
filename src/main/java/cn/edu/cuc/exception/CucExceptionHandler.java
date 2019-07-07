package cn.edu.cuc.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ExceptionHandler;

import cn.edu.cuc.result.ResItem;

@ControllerAdvice
public class CucExceptionHandler {

	@ResponseBody
	@ExceptionHandler(Exception.class)
	public ResItem processException(Exception e) {
		ResItem res = new ResItem();
		res.setHttpcode(200);
		res.setSuccess(false);
		res.setErrcode(-1);
		res.setErrmsg(e.getMessage());
		return res;
	}

	@ResponseBody
	@ExceptionHandler(Throwable.class)
	public ResItem processThrowable(Throwable e) {
		ResItem res = new ResItem();
		res.setHttpcode(200);
		res.setSuccess(false);
		res.setErrcode(-1);
		res.setErrmsg(e.getMessage());
		return res;
	}
}
