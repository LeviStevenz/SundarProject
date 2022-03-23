package com.exception;

public class EmployeeNotFoundException extends Exception {

        @Override
        public String getMessage() {
        	
        	return "NOT FOUND";
        }
	
}
