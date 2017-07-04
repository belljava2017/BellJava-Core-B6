package com.bell.batch6.day8;

public class SuperDemo {

	public static void main(String[] args) {
		Dog d = new Dog();
	}

}

class Animal {
	//Overloading can be done for Constructor as well
	
	Animal(){
		System.out.println("I'm the Animal");
	}
	
	Animal(int weight){
		System.out.println("I'm the Animal with weight "+ weight);
	}
	
	Animal(String type){
		System.out.println("I'm the Animal belongs to " + type+ " category");
	}
}
//Constructor Overriding not possible
class Dog extends Animal{
	
	Dog(){
	 super("dog");
	 System.out.println("I'm the dog");
	 
	
	}
	
}