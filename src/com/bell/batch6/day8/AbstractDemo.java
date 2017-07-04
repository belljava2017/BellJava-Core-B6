package com.bell.batch6.day8;

public class AbstractDemo {

	public static void main(String[] args) {
		Car c = new BMWMaker();

	}

}

// All concerete methods with abstract class - is possible
//if one or more abstract methods - then you must make class as abstract class
//if you extend abstract class then you must provide an implemention to the abstract method or make class as abstract
//Car c ; //reference variable of abstract class can be created
//new Car();//object of abstract class not allowed

abstract class Car{
	
	void engineRunsOn(){
		System.out.println("On Gas");
	}
	
abstract void model();
abstract void design();
}

class BMWMaker extends Car{
	void model(){
		System.out.println("I'm BMW model");
	}


	void design() {
		// TODO Auto-generated method stub
		
	}
}

abstract class Honda extends Car{
	
}

class Acura extends Honda{
	void model(){
		System.out.println("I'm the Acura Model");
	}

	
	void design() {
		// TODO Auto-generated method stub
		
	}
	
}