package com.sp.learner.code.ui;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/account")
@RestController
public class Controller {
	
	@GetMapping("/status/check")
	public String statusCheck()
	{
		return "Working";
	}

}
