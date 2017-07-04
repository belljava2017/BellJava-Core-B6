package com.bell.batch6.day21st;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapDemo {

	public static void main(String[] args) {
		Movie m1 = new Movie("GOT", "French", 10, 30.50);
		Movie m2 = new Movie("BreakingBad", "English", 6, 40.50);
		Movie m3 = new Movie("Narcos", "Spanish", 9, 20.50);
		Movie m4 = new Movie("LastManStanding", "British", 8, 60.50);
		Movie m5 = new Movie("Friends", "English", 7, 50.00);
		
		
		Map<Movie,Integer> movieMap = new TreeMap<>();
		/* Inserting data in to from HashMap*/
		movieMap.put(m1, 5);
		movieMap.put(m2, 15);
		movieMap.put(m3, 2);
		movieMap.put(m4, 50);
		movieMap.put(m5, 55);
		
		/*Option 1 Extracting from HashMap*/
		Set<Movie> mSet = movieMap.keySet(); 
		System.out.println("Option 1 Extracting from HashMap");
		for(Movie m: mSet){
			System.out.println("Movie Details: "+ m +" number of copies "+ movieMap.get(m) );
		}
		
		/*Option 2 Extracting from HashMap*/
		System.out.println("Option 2 Extracting from HashMap");
		for(Map.Entry<Movie, Integer> entry: movieMap.entrySet()){
			System.out.println("Movie Details: "+entry.getKey() + "copies "+entry.getValue());
			
		}
		
		Collections.synchronizedMap(movieMap);
		
	}

}
