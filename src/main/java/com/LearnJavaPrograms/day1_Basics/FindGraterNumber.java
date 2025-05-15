package com.LearnJavaPrograms.day1_Basics;

import com.LearnJavaPrograms.day1_Basics.allMethods.AllMethods;

public class FindGraterNumber {

	public static void main(String[] args) throws Exception {
		
		// calling findMax() method from AllMethods class
		
		int result = AllMethods.findMax(99,88,1,1);
		System.out.println(result);

	}

}
