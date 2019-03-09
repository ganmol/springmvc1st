package com.ag.mvc.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;


@Constraint(validatedBy = CourseCodeContraintValidator.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD ,ElementType.FIELD})
public @interface courseCode {

	//define coursecode fields
	public String value() default "TOPS" ;
	
	//define coursecode error message
	 public String message() default "must begin with TOPS";
	 
	 //define default groups
	 public Class<?>[] groups() default {};
	 
	 //define payloads 
	 public Class<? extends Payload>[] payload() default {}; 
}
