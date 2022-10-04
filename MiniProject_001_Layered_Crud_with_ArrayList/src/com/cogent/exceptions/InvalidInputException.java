package com.cogent.exceptions;

public class InvalidInputException extends IllegalArgumentException {
	public InvalidInputException(){
		super();
	}
	public InvalidInputException(String exception){
		super(exception);
	}

}
