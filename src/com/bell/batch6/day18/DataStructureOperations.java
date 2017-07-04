package com.bell.batch6.day18;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class DataStructureOperations {

	public static void main(String[] args) {		
		MobilePhone mp1 = new MobilePhone();
		mp1.setName("Samsung");
		mp1.setCost(700.00);
		mp1.setOs("Android");
		MobilePhone mp2 = new MobilePhone();
		mp2.setName("Apple");
		mp2.setCost(600.00);
		mp2.setOs("iOS");		
		MobilePhone mp3 = new MobilePhone();
		mp3.setName("LG");
		mp3.setCost(500.00);
		mp3.setOs("Android");
		MobilePhone mp4 = new MobilePhone();
		mp4.setName("Apple");
		mp4.setCost(600.00);
		mp4.setOs("iOS");	
		//ArrayList
		System.out.println("In ArrayList");
		List<MobilePhone> mpList = new ArrayList<>();
		mpList.add(mp1);
		mpList.add(mp2);
		mpList.add(mp3);
		mpList.add(mp4);
		for(MobilePhone mp : mpList){
			System.out.println(mp);
		}
		
		System.out.println("In HashSet");
		//HashSet
		Set<MobilePhone> mpSet = new HashSet<>();
		mpSet.add(mp1);
		mpSet.add(mp2);
		mpSet.add(mp3);	
		mpSet.add(mp4);	
		for(MobilePhone mp: mpSet){
			System.out.println(mp);
		}
		
		//TreeSet
		System.out.println("In TreeSet");
		Set<MobilePhone> mpTSet = new TreeSet<>();
		mpTSet.add(mp1);
		mpTSet.add(mp2);
		mpTSet.add(mp3);
		mpTSet.add(mp4);
		for(MobilePhone mp: mpTSet){
			System.out.println(mp);
		}
		
		
		
	}

}
