package com.study.spring;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;


@Constraint(validatedBy=HobbyValidator.class)
@Target({java.lang.annotation.ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface IsValidHobby {

	String listOfValidHobby() default "Sport|Music|Movies";
 	String message() default "Please provide valid hobby: Sport,Music,Movies";
	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

}
