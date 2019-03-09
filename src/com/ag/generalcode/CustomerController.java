package com.ag.generalcode;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	
	@RequestMapping("/showForm")
	public String showForm(Model model){
		model.addAttribute("customer" ,new Customer());
		return "customer-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("customer") Customer customer , BindingResult theBindingResult ){
		System.out.println("binding result to get error code to provide error msg" +theBindingResult );
		
		if(theBindingResult.hasErrors())
		return "customer-form";
		else
			return "customer-confirm";
	}
	
	
	 //InitBinder will register coustomer editor 
	 // StringTrimmerEditor  will eliminate all trailling and leading white space 
	 @InitBinder
	public void initBinder(WebDataBinder dataBinder){
		StringTrimmerEditor strTrimEditor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, strTrimEditor);
	}
	
	
}
