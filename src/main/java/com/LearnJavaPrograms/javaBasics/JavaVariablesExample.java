package com.LearnJavaPrograms.javaBasics;

public class JavaVariablesExample {
	
	/**
	 * 1. Variable which are declared within the class but outside the any Method,
	 * Constructor or block is called as Instance variable.
	 * >> We can call the instance variable by using the object or object reference but object
	 * reference is recommended.
	 * 
	 * 2. Variable which are declared within the class but outside the any Method,
	 * Constructor or block with a static modifier is called as class variable or
	 * static variable.
	 * >> We can call the static variable by using Object, Object reference ,direct.
	 *  or with the help of class name.
	 * 
	 * 3. Variable which are declared within the Method, Constructor or block
	 * is called Local variable
	 * >> There are only one way to call the local variable by using direct call.
	 * @param args
	 */

	// Declare the instance variable
	int id;
	String sname;
	String saddress;
	
	
	// Declare the class variable 
	static String scollageName; 
	public static void main(String[] args) {
		
		// Declare local variable
		int a=10;
		int b=20;

	}

}
