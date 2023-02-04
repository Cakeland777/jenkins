package com.myboot04;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {
	@GetMapping("/")
	@ResponseBody
	public String home() {
		
		return "Hello World";
	}
	
	
	@GetMapping("/hello.do")
	public String hello(Model model) {
		
		model.addAttribute("message","hello");
		return "hello";
	}

}
