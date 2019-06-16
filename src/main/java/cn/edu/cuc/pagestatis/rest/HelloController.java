package cn.edu.cuc.pagestatis.rest.hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.edu.cuc.pagestatis.model.hello.*;

@RestController
public class HelloController {
	private static final String template = "Hello, %s!";

	@RequestMapping("/hello")
	public Hello hello(@RequestParam(value="name", defaultValue="World") String name) {
		return new Hello(String.format(template, name));
	}
}