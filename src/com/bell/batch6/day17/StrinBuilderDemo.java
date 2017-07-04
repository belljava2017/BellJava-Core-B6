package com.bell.batch6.day17;

public class StrinBuilderDemo {

	public static void main(String[] args) {
		
		String name ="Siva";
		name = name+"Prasad";
		name = name +"koka";
		System.out.println(name);
		//if you're application running around multithreaded environment
		//then you must choose StringBuffer else go with StringBUildeer
		StringBuffer name2 = new StringBuffer("Siva");
		name2.append("prasad");
		name2.append("koka");
		System.out.println(name2);
		
		
		//When there is no mutithreaded scenarios
		StringBuilder name1 = new StringBuilder("Siva");
		name1.append("prasad");
		name1.append("koka");
		
		System.out.println(name1);
		
		
		
	}

}
