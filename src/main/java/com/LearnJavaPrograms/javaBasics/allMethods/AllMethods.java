package com.LearnJavaPrograms.javaBasics.allMethods;

public class AllMethods {
	
	/**
	 * This method is able to swap two number with the help of 
	 * third variable. This method required 2 argument.
	 * @param number1
	 * @param number2
	 */
	
	public static void swapWithThirdVariable(int number1, int number2) {
		
		System.out.println("Before swap the number are::"+number1+" "+number2);
		
		int result = number1;
		number1 = number2;
		number2 = result;
		
		System.out.println("After swap the number are::"+number1+" "+number2);
		
	}

}
