package com.bell.batch6.day13;

import java.util.Scanner;

public class ExceptionsHandlingDemo {

	public static void main(String[] args) {
		try{
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter a value");
			int a = scan.nextInt();
			System.out.println("Enter b value");
			int b = scan.nextInt();
			int c = a/b;
			System.out.println("Result" + c);
			int x[] = new int[1];
			x[0] = 20;
			x[1] =32;
		}
		catch(ArithmeticException e){
			System.out.println("Hey..Looks like Arithemtic Exception - inputs are wrong, please try again.");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("New Exception");
			e.printStackTrace();
		}
		catch(Exception e){
			System.out.println("New Exception");
			e.printStackTrace();
		}
		System.out.println("Program FInished");
		
	}

}
