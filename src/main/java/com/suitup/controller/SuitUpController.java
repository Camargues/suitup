package com.suitup.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SuitUpController {

	@RequestMapping("/{url}.do")
	public String viewPage(@PathVariable String url) {
		return url;
	}
}
