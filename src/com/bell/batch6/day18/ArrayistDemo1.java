package com.bell.batch6.day18;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayistDemo1 {

	public static void main(String[] args) {
		
		
		ArrayList<String> al = new ArrayList<>();
		
		al.add("Siva");
		al.add("santosh");
		al.add("kumar");
		
		//step 1 simple for loop
		
		for(int i=0;i<=al.size()-1;i++){
			System.out.println(al.get(i));
		}
		
		// forEach loop
		for(String bla:al){
			System.out.println("For Each Loop: "+ bla);
		}
		
		//Using Iterartor Interface
		Iterator<String> itr = al.iterator();
		
		while(itr.hasNext()){
			System.out.println("Inside iterator: "+ itr.next());
		}
		

	}

}


