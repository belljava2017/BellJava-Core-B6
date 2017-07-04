package com.bell.batch6.day18;
import java.util.*;

public class ArrayLvsLinkedL {
	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<String>();
		List<String> linkedList = new LinkedList<String>();
		int count = 2000000;
		/*
		 * First let us insert 2000000 numbers into each list
		 */
		for (int i = count; i > 0; i--) {
			arrayList.add("siva");
			linkedList.add("siva");

		}

		/*
		 * Now let us test the performance of two lists based on insertion.
		 */
		insertion( arrayList);
		insertion(linkedList);

		
		/*
		 * Now let us check the performance of searching elements in both lists.
		 */
		System.out.println("\n");
		searching(arrayList);
		searching(linkedList);
		/*
		 * Now let us check the performance of deleting elements in both lists.
		 */
		System.out.println("\n");
		deletion(arrayList);
		deletion(linkedList);
		
		

	}

	public static void insertion( List<String> list) {
		long beforeInsertionTime, afterInsertionTime;
		beforeInsertionTime = System.currentTimeMillis();
		for (int i = 9999; i < 10099; i++)
			list.add(i,"seelam");
		afterInsertionTime = System.currentTimeMillis();
		
		long diff = afterInsertionTime - beforeInsertionTime;
		System.out.println(list.getClass().getSimpleName()+" insertion time: " + diff + "ms");
	}
	public static void searching(List<String> list){
		long  beforeInsertionTime,afterInsertionTime; 
		beforeInsertionTime = System.currentTimeMillis();
		 for (int i = 9999; i<19999; i++ ) {
			 list.get(i);
		 }
		 afterInsertionTime = System.currentTimeMillis();
		 
		 long diff = afterInsertionTime-beforeInsertionTime;
		 System.out.println(list.getClass().getSimpleName()+" searching time: "+diff+"ms");
	}
	public static void deletion(List<String> list){
		long  beforeInsertionTime,afterInsertionTime; 
		beforeInsertionTime = System.currentTimeMillis();
		 for (int i = 9999; i<10099; i++ ) {
			 list.remove(i);
		 }
		 afterInsertionTime = System.currentTimeMillis();
		 
		 long diff = afterInsertionTime-beforeInsertionTime;
		 System.out.println(list.getClass().getSimpleName()+" deletion time: "+diff+"ms");
	}
	

}