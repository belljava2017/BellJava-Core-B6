package com.bellinfo.batch6.day7;

public class ConstructorDemo {

	public static void main(String[] args) {
		
		
		//creating reference var
		//allocate memory for instance variable
		//constructor will be invoked
		//assign the block address to reference variable
		Employee emp = new Employee(10,20.0f);
		emp.display();
	}

}


class Employee {
	
	int a;
	float b;
	
	
	Employee(){
	  System.out.println("Default Constructor");
    }
    
		//When you're wrriting argument based constructor - you must add default constructor a
    Employee(int a, float b){
    	this.a = a;
    	this.b = b;
    	
    	System.out.println("passed values"+a +" "+b);
    }
    
    void display(){
    	System.out.println("Values "+ a + " "+b);
    }
	
	
}