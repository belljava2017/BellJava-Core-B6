package com.bell.batch6.day17;

public class WrapperDemo {

	public static void main(String[] args) {
		
		int a =10;
		int b=20;
		//Wrapper classes helps to convert primitive to Objects and Objects to Primitive DataTypes
		//int -Interger
		//boolean  - Boolean
		//float - Float
		//long - Long
		//1 way to convert in to Integer Object
		Integer integer = new Integer(a);
        //2ns way
		Integer integer1 = Integer.valueOf(b);
		//Converting Integer Object to Primitive DataType
		int x = integer.intValue();
		System.out.println("x" + x);
		
		//Convert from Integer Object to String
		String y = integer.toString();
		
		System.out.println(y);
		
		double d = integer.doubleValue();
		
		System.out.println(d);
		
		String str1 = new String("123");
		Integer realInt = new Integer(str1);
		System.out.println(realInt.intValue());
		
		
		String str2 = new String("ABCD");
		Integer realInt1 = new Integer(str2);
		System.out.println(realInt1.intValue());
		
		
		
		
		
		
		
		
		
		
		
				
				
		
		
		
		
		
	}

}
