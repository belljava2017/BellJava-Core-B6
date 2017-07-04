package com.bell.batch6.day6;

public class HararchicalnheritanceDemo {

	public static void main(String[] args) {
	   Child2 c2 = new Child2();
	   Child3 c3 = new Child3();
	   c2.pMethod();
	   c3.pMethod();
	   
  
	}

}

class Parent2{
	public void pMethod(){
		System.out.println("I'm parent");
	}
}

class Child2 extends Parent2 {
	
}

class Child3 extends Parent2{
	
}