package com.bell.batch6.day13;

import java.util.Scanner;

public class ExceptionScenario {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a value");
		int a = scan.nextInt();
		System.out.println("Enter b value");
		int b = scan.nextInt();
	    int c = a/b;
	    System.out.println("Result" + c);
	    
	    
	    System.out.println("Program Finished");
		
	}

}
