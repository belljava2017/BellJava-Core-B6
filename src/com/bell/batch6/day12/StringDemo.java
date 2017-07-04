package com.bell.batch6.day12;

public class StringDemo {

	public static void main(String[] args) {
		
		//String is built in java class
		//String objects are immutable(can't modified)
		//String reference var are mutable(they are as good other reference var)
		//str1 inserts in to string pool constant
		//String class overrided Object class .equals() method.
		// Object class .equlas compares reference variables but String class equals method comapres content of that String
		
		String str1 = "Orange";
		// str2 get object from SPC
		String str2 = "Orange";
		// str3 spearate new object will be created outside SPC
		String str3 = new String("Orange");
		//str4 spearate new object will be created outside SPC
		String str4 = new String("Orange");
		
		if(str1.equals(str3)){
			System.out.println("str1.equals(str3) is   same");
		}else{
			System.out.println("str1.equals(str3) is  different");
		}
		if(str1.equals(str4)){
			System.out.println("str1.equals(str4) is   same");
		}else{
			System.out.println("str1.equals(str4) is  different");
		}
		
		
		
		
		
		if(str1==str2){
			System.out.println("str1 ==str2 is same");
		}else{
			System.out.println("str1 ==str2 is different");
		}
		
		if(str1==str3){
			System.out.println("same");
		}else{
			System.out.println("str1==str3 is  different");
		}
		
		if(str3==str4){
			System.out.println("same");
		}else{
			System.out.println("str3==str4 is  different");
		}
		
		
		String name = "Raja";
		name = name +" pooja";
		
		
		String strObj = "This is java string world. And an intersting topic to learn";
		int size = strObj.length(); 
		System.out.println(size);
		System.out.println(strObj.charAt(10));
		System.out.println(strObj.compareTo("This is java string world. And an intersting topic to learn"));
		System.out.println(strObj.concat("sasasasasaassasasasas"));
		System.out.println(strObj.toLowerCase());
		
		
	}

}






