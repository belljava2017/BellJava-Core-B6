package com.bell.batch6.day6;

public class SimpleInhertanceDemo {

	public static void main(String[] args) {
	   //Normal
		//Parent p = new Parent();
		//p.parMethod();
		
		// Noraml
		Child c = new Child();
		//c.childMethod();
		
		c.parMethod();
		int cash1 = c.cash;
		
	}

}

class Parent{
	protected int cash = 100000;
	String land ="50 Acres";
    void parMethod(){
    	int a =10;
	 	System.out.println("Parent property:" + cash + ",  "+land);
	}
	
}

class Child extends Parent{
	
	
	void childMethod(){
		System.out.println("I have nothing for now");
	}
	
}