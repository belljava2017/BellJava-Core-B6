package com.bell.batch6.day6;

public class MultiLevelInhertanceDemo {

	public static void main(String[] args) {
		Child1 c1 = new Child1();
		c1.GMethod();
		c1.PMethod();
		
	
	}

}

class GrandParent1 {
	
	public void GMethod(){
		System.out.println("This is GrandParent");
	}
}

class Parent1 extends GrandParent1 {
	public void PMethod(){
		System.out.println("This is Parent");
	}
}

class Child1 extends  Parent1{
	
	
}