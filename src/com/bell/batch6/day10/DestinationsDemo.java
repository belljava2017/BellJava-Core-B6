package com.bell.batch6.day10;

import java.util.Arrays;
import java.util.Scanner;

public class DestinationsDemo {

	public static void main(String[] args) {
		// Destinations informations
		//1st Destination
		String[] d1Hotels = {"Hyat","Prestige","Raheja"};
		double[] d1Cost = {200.00,350.50,500.60};
		int[] d1Days = {3,5,8};
		Destinations hydDest = new Destinations("Hyd", "TG",d1Hotels ,d1Cost ,d1Days);
		//2nd Destination
		String[] d2Hotels = {"Amaravati","Sagar","Tripta"};
		double[] d2Cost = {280.00,550.50,600.60};
		int[] d2Days = {2,5,10};
		Destinations AmarDest = new Destinations("Amaravati", "AP",d2Hotels ,d2Cost ,d2Days);
		//3rd Destination
		String[] d3Hotels = {"Hyatt1","ALLInONE","Extended"};
		double[] d3Cost = {210.00,750.50,590.60};
		int[] d3Days = {3,5,8};
		Destinations goaDest = new Destinations("Goa", "MT",d3Hotels ,d3Cost ,d3Days);
		
		// Hyd in TG and Pakage Details:
		 //     1. Hyat - 200 - 3 days package
		//      2. Prestigate - 350.50 5 days package
		
		Destinations[] holidaySpots = new Destinations[3];
		holidaySpots[0] = hydDest;
		holidaySpots[1] = AmarDest;
		holidaySpots[2] = goaDest;
		
		// Let the customer enter his destination, so that we display the package avaliable.
		
		System.out.println("Welcome to our website, Please enter your destination ?");
		Scanner scan = new Scanner(System.in);
		String customerDest = scan.next();
		boolean found = false;
		for(int i=0; i<holidaySpots.length;i++){
			Destinations d = holidaySpots[i];
			if(customerDest.equals(d.getName())){
				found  = true;
				System.out.println("Good News...we found your destination with awesome package. Here are the details");
				System.out.println(d.toString());
				break;
			}
		}

		if(!found){
			System.out.println("Ohh...Sorry, We couldn't find your destination. Please check beck.");
		}
		
	}

}


class Destinations {
	private String name;
	private String location;
	private String[] hotels;
	private double[] packageCost;
	private int[] noOfDays;
	
	Destinations(){
		
	}
	
	Destinations(String name, String location, String[] hotels, double[] cost, int[] days){
		this.name = name;
		this.location = location;
		this.hotels = hotels;
		packageCost = cost;
		noOfDays = days;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String[] getHotels() {
		return hotels;
	}

	public void setHotels(String[] hotels) {
		this.hotels = hotels;
	}

	public double[] getPackageCost() {
		return packageCost;
	}

	public void setPackageCost(double[] packageCost) {
		this.packageCost = packageCost;
	}

	public int[] getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(int[] noOfDays) {
		this.noOfDays = noOfDays;
	}

	@Override
	public String toString() {
		return "Destinations [name=" + name + ", location=" + location
				+ ", hotels=" + Arrays.toString(hotels) + ", packageCost="
				+ Arrays.toString(packageCost) + ", noOfDays="
				+ Arrays.toString(noOfDays) + "]";
	}
	
	
	
	
	
}