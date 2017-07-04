package com.bell.batch6.day13;

public class ErrorScenario {

	public static void main(String[] args) {
		method1();
		method2();
	}

	static void method1(){
	   method2();
		System.out.println("I'm in method1");
	}
	
	static void method2(){
		method1();
		System.out.println("I'm in method2");
	}
}
