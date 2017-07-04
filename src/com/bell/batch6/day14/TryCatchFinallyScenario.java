package com.bell.batch6.day14;

public class TryCatchFinallyScenario {

	public static void main(String[] args) {
		method1();

	}
	
	static void method1(){
		int a =10;
		int b =0;
		int arr[] = new int[1];
		System.out.println("Inside method1");
		try{
		method2(a,b,arr,2);
		}catch(ArithmeticException e){
			System.out.println("Arithmetic Excepetion Occured");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOfBoundsException Excepetion Occured");
		}
	}
	
	static void method2(int a, int b,  int[] arr, int index) throws ArithmeticException{
		System.out.println("Inside Method 2");
		method3( a,  b,arr,index);
	}

	static void method3(int x, int y,int[] arr, int index) throws ArithmeticException{
		int c =0;
		
		System.out.println("Inside method3");
		TryCatchFinallyScenario tcf =null;
		try{
			arr[index] =20;
			c =x/y;
			tcf.method4();
			
			
			
		System.out.println(c);
		}
		catch(NullPointerException e){
			System.out.println("NullPointerException  Occured");
		}
		finally{
			System.out.println("I execute all the time");
		}
		
		
	}
	
	void method4(){
		System.out.println("Inside metd4");
	}
	
}
