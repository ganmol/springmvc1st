package com.ag.generalcode;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dropDown")
public class DropDownController {

	@RequestMapping("/")
	public String showMyPage(){
		//returning view page name associated with this controller.
		return "dropDown.jsp";
	}
}
