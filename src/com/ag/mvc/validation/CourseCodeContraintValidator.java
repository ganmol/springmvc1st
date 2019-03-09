package com.ag.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeContraintValidator implements ConstraintValidator< courseCode , String> {

	private String theCoursePrefix;
	@Override
	public void initialize(courseCode cousrevalue) {
		theCoursePrefix = cousrevalue.value();
		System.out.println("theCoursePrefix"+theCoursePrefix);
	}
	
	
	@Override
	public boolean isValid(String code, ConstraintValidatorContext theConstraintValidatorContext) {
		 boolean result;
		if(code!=null){
			 result=code.startsWith(theCoursePrefix);
		}
		else
		{
			return true;
		}
		return result;
	}

}
