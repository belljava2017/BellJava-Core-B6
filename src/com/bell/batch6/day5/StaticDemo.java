package com.bell.batch6.day5;

public class StaticDemo {

	
	
	public static void main(String[] args) {
		
		
	}

}

class ABC{
	int x ; //instance variable
	static int y ; //static variable
	//static memebers can be called inside nonstatic methods
	 void display1(){
		 System.out.println(x);
		 System.out.println(y);
		 display2();
		 
	 }
	 
	 static void display2(){
		 System.out.println("inside static method");
		 
		 ABC abc = new ABC();
		 
		 abc.display1(); //non static members can't accessed inside static method
		 
	 }
	
	 static void display3(){
		 System.out.println("inside static methods...");
	 }
	 
	 
}
