package com.bellinfo.batch6.day7;

public class OverloadingDemo {

	public static void main(String[] args) {
		EmployeeDetails ed = new EmployeeDetails();
		ed.employeeDet(1);
		ed.employeeDet("sarath");
		ed.employeeDet(1, "kumar");
		ed.employeeDet("ravi", 12);
		//ed.employeeDet("ravi", "12102");

	}

}

class EmployeeDetails{
	
	// Order of the parameters
	// Type Of the parameters
	// Size of the parameters
	//rt doesn't matters
	void employeeDet(String name){
		System.out.println("employee details: "+name);
	}
	

	
	
	
	void employeeDet(int id, String name){
		System.out.println("employee details: "+name + " "+ id);
	
	}
	
	
	static void employeeDet( String name,int id){
		System.out.println("employee details: "+name + " "+ id);
	}
	
	private void employeeDet(String name,String salary){
		System.out.println("employee details: "+name + " "+ salary);
	}
	
	
	void employeeDet(int id){
		System.out.println("employee details: "+ id);
	}
	
}