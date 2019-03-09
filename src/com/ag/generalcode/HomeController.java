package com.ag.generalcode;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String showMyPage(){
		//returning view page name associated with this controller.
		return "view-menu";
	}
}
