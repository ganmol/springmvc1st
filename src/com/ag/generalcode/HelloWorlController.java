package com.ag.generalcode;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//Adding parent mapping b'coz showForm mapping is used by two method to eliminate ambiquity 
//and also change mapping in the view menu as hello/showForm
@RequestMapping("/hello")
public class HelloWorlController {

	/*
	 * method to show the html form
	 */
	@RequestMapping("/showForm")
	public  String showForm(){
		return "helloWorld-form";
	}
	
	/*
	 *  method to process the html form
	 */
	@RequestMapping("/processForm")
	public  String processForm(){
		return "helloWorld";
	}
	//Option 1
	
	/*req obj holds html data.
	model ; container for data*/
	/*@RequestMapping("/getNameInCaps")
	public String getNameInCaps(HttpServletRequest req , Model model){
		String name= req.getParameter("StudentName");
		name=name.toUpperCase();
		//add atribute to model
		model.addAttribute("nameInCaps", name);
		return "helloWorld";
	}
	*/
	//Option 2
	
	@RequestMapping("/getNameInCaps")
	public String getNameInCaps(
			@RequestParam("StudentName") String name, Model model){
		name=name.toUpperCase();
		String result = "Using Request Param "  + name;
		model.addAttribute("nameInCaps", result);
		return "helloWorld";
	}
	
}
