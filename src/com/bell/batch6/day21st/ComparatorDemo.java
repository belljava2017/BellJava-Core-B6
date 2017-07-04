package com.bell.batch6.day21st;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorDemo {

	public static void main(String[] args) {
		
		Movie m1 = new Movie("GOT", "French", 10, 30.50);
		Movie m2 = new Movie("BreakingBad", "English", 6, 40.50);
		Movie m3 = new Movie("Narcos", "Spanish", 9, 20.50);
		Movie m4 = new Movie("LastManStanding", "British", 8, 60.50);
		Movie m5 = new Movie("Friends", "English", 7, 50.00);
		
		List<Movie> mList = new ArrayList<>();
		mList.add(m1);
		mList.add(m2);
		mList.add(m3);
		mList.add(m4);
		mList.add(m5);
		
		System.out.println("******* Before Sorting *****");
		for(Movie m:mList){
			System.out.println(m);
		}
		
		System.out.println("********After Sorting **********");
		Collections.sort(mList, new RatingBasedCriteria());
		for(Movie m:mList){
			System.out.println(m);
		}
		
		//formula to store and retrive from HashSet, HashMap, Hashtable is (hashCode() & n-1) bitwise &
		System.out.println("m1 bucket" + (m1.hashCode() & 15 ));
		System.out.println("m2 bucket" + (m2.hashCode() & 15));
		System.out.println("m3 bucket" + (m3.hashCode() & 15));
		System.out.println("m4 bucket" + (m4.hashCode() & 15));
		System.out.println("m5 bucket" + (m5.hashCode() & 15));
		
	}

}
