package com.bellinfo.batch6.practice;

public class OverrideDemo {

	public static void main(String[] args) {
		
		//SuperClass Obj cannot hold by subclass Reference Varible
		//Make m = new Car();
		Car c = new Make();
		
		c.onlyCarMethod();
		c.orMethod();
		
		
	}

}

class Car {
	
	public void orMethod(){
		System.out.println("Car ORMethod");
	}
	
	public void onlyCarMethod(){
		System.out.println("Only Car");
	}
}

class Make extends Car{
	
	public void orMethod(){
		System.out.println("Car ORMethod");
	}
	
	public void onlyMake(){
		System.out.println("Only Make");
	}
	
	

}