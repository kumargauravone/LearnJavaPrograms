package com.LearnJavaPrograms.day1_Basics.allMethods;

public class AllMethods {
	
	/**
	 * This method is able to swap two number with the help of third variable.
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
	
	/**
	 * This method is able to swap two number without third variable.
	 * @param number1
	 * @param number2
	 */
	public static void swapWitoutVariable(int number1, int number2) {
		
		System.out.println("Before swap the number are::"+number1+" "+number2);
		
		number1 = number1 + number2;
		number2 = number1 - number2;
		number1 = number1 - number2;
		
		System.out.println("After swap the number are::"+number1+" "+number2);
		
	}
	
	/**
	 * This method is check the given number is Odd or Even
	 * @param number
	 */
	public static void oddEvenChecker(int number) {
		if(number%2 == 0) {
			System.out.println(number+" is Even number");
		}else
			System.out.println(number+" is Odd number");
	}

}
