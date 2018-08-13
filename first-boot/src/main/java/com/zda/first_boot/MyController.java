package com.zda.first_boot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		return "Hello World";
	}
}
