package com.bell.batch6.day11;

public class GarbageCollectionDemo {

	public static void main(String[] args) {
		 methodx();
		
		//1 When you assign reference varibale to NULL then the Object holding by that reference varibale becomes eligle for GC. 
		Toddler td = new Toddler();
		td =null;
       
		// 2nd scenario. Object hold by td1 before assigning td2 will become eligible for GC
		
		Toddler td1 = new Toddler();
	    Toddler td2 = new Toddler();
	    td1 = td2 ;
		
	    
		System.gc();
		Runtime.getRuntime().gc();
	
		
	}
	
	static void methodx(){
		//3 When reference var reaches out of scope then that object becomes eligilbe for garbage collection
		Toddler td3 = new Toddler();
	}

}


class Toddler{
	
	private String name = "Ruthvik";
	private int age = 20;
	
	public void playing(){
		System.out.println("At kinder garden");
	}
	
	public void eating(){
		System.out.println("Eating choclates");
	}
	
	
}