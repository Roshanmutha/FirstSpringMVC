package com.study.spring;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class HobbyValidator implements
		ConstraintValidator<IsValidHobby, String> {

	private String listOfValidVals;
	
	@Override
	public void initialize(IsValidHobby arg0) {
		// TODO Auto-generated method stub
		listOfValidVals=arg0.listOfValidHobby();
	}

	@Override
	public boolean isValid(String hobby, ConstraintValidatorContext arg1) {
		if (hobby == null) {
			return false;
		}

		if (hobby.matches(listOfValidVals)) {
			return true;
		} else {
			return false;
		}
	}

}
