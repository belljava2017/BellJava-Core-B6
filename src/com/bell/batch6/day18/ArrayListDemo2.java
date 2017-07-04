package com.bell.batch6.day18;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;

public class ArrayListDemo2 {

	public static  void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size");
		ArrayList<String> al = new ArrayList<>();
		//ArrayList<E Object> genric = new ArrayList<>();
		HashSet<String> hs = new HashSet<>();
		LinkedList<String> ls = new LinkedList<>();
		TreeSet<String> ts = new TreeSet<>();
		
		int size = scan.nextInt();
		
		for(int i=0;i<=size-1;i++){
			System.out.println("Enter color name:");
			String c = scan.next();
			al.add(c);
			hs.add(c);
			ls.add(c);
			ts.add(c);
			//genric.add(c);
			
		}
		
		/*System.out.println("What color you looking for");
		String color = scan.next();
		if(al.contains(color)){
			System.out.println("Yes, we found it");
		} else {
			System.out.println("We don't have it");
		}*/
		
		/*System.out.println("ArrayList Display");
		
		System.out.println("ArrayList Display");
		
		System.out.println("ArrayList Display");
		for(String s:al){
			System.out.print(s + " ");
		}
		System.out.println("");
		System.out.println("LinkedList Display");
		for(String s:ls){
			System.out.print(s + " ");
		}*/
		
		System.out.println("");
		System.out.println("HashSet Display");
		for(String s:hs){
			System.out.print(s + " ");
		}
		
		System.out.println("");
		System.out.println("TreeSet Display");
		for(String s:ts){
			System.out.print(s + " ");
		}
		
		
	}

}
