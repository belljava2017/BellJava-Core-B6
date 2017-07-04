package com.bell.batch6.day8;

public class OverridingDemo {

	public static void main(String[] args) {
		
		/*Person p = new Person();
		//p.method1();
		Employee e = new Employee();
		e.method1();*/

		// what if subclass reference var holds SuperClass object - this is not possible
		//Employee e = new Person();
	    // what if superclass reference var holds Subclass Object  - this possible
		// childOnlymethods/data can't be accessed with superclass reference varible
		// ParentOnly methods can be accessed with superclass reference var holding Subclass Object
		Person p1 = new Employee();
		p1.qualification();
		p1.sense();
	//	p1.employeeSalary();
		//p1.childOnlyMethod();
		
   
	}

}

class Person{
	String name;
	char geneder;

	public void qualification(){
		
		System.out.println("No qualification required to be called as a person");
	}
	
	public void sense(){
		System.out.println("A person should a sense");
	}
	
}

class Employee extends Person{
	
	int id;
	int salary;
	
	public void qualification(){
		System.out.println("You need to have a bachelor degree and offer to be called an employee");
	}
	
	public void employeeSalary(){
		System.out.println("I'm in Employeed child Class");
	}
}



class Student extends Person{
	
	int id;
	int fee;
	
	public void method1(){
		System.out.println("I'm an Student");
	}
	
}