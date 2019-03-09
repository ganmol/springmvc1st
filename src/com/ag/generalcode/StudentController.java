package com.ag.generalcode;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/studentForm")
	public String studentForm(Model model){
		Student stu =  new Student();
		model.addAttribute(stu);
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student stu){
		System.out.println("student obj populated from model" +stu.getFirstName() + "  " + stu.getSecondName());
		return "student-confirm";
	}
}
