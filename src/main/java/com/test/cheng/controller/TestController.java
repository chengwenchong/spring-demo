package com.test.cheng.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.cheng.service.TestService;

@Controller
@RequestMapping("/test")
public class TestController {
	
	@Resource
	private TestService testService;
	
	@RequestMapping("/showSuccess")
	public String toShowSuccess(Model model){
		model.addAttribute("users", testService.getUsers());
		return "showUser";
	}
	
}
