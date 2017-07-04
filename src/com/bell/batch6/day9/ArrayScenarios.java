package com.bell.batch6.day9;

public class ArrayScenarios {

	public static void main(String[] args) {
		System.out.println("SASASA");
		int a1;
		int b1=20;
		int a =10,b=20,c=30;
		//declarion and intialization of an array
		 int xyz[] = new int[]{10,20,30}; //index always starts with zero
		 //declaration of an array
		int arr[] = new int[20]; 
		//initalization explicitly
		arr[0] = 20;
		arr[1] = 21;
		arr[2] = 22;
		int[] abc = new int[4];
		int[] pqr = {24,34,54,65};
  		
		
		float[] f = {10.0f,10.2f,23.43f};
		
		String[] names = {"java","cava","sava","teva","nava"};
		System.out.println("Size = "+names.length);
		System.out.println();
		for(int i=0;i<=names.length-1;i++){
			System.out.print(names[i] +" ");
		}
		
		
		
	}

}
