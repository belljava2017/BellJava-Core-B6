package com.bell.batch6.day17;

public class GenericsDemo {

	public static void main(String[] args) {
		Example e = new Example();
		e.setA(20);
		System.out.println("value "+e.getA());
		ExampleDouble ed = new ExampleDouble();
		ed.setA(20.04);
		System.out.println("value "+ed.getA());
		
		GenExample<Integer> ge = new GenExample<>();
        ge.setA(50);
        System.out.println("value "+ge.getA());
        
        GenExample<Double> de = new GenExample();
        de.setA(20.03);
        System.out.println("value "+de.getA());

        GenExample<String> se = new GenExample();
        se.setA("Siva");
        System.out.println("value "+se.getA());
        
		
        Student s1 = new Student();
        s1.setName("Koka");
        s1.setRollNumber(1221);
        
        Student s2 = new Student();
        s2.setName("Madhav");
        s1.setRollNumber(3232);
        
        GenExample<Student> ges = new GenExample<>();
        ges.setA(s1);
        System.out.println(s1);
        
        
	}

}

class GenExample<T> {
	
	private T a;
	public T getA(){
		return a;
	}
	
	public void setA(T a){
		this.a = a;
	}
	
}

class Student {
	String name;
	int rollNumber;

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
	
	
	
}


class Example {
	
	private int a;
	public int getA(){
		return a;
	}
	
	public void setA(int a){
		this.a = a;
	}
	
}

class ExampleDouble {
	
	private double a;
	public double getA(){
		return a;
	}
	
	public void setA(double a){
		this.a = a;
	}
	
}