package com.bellinfo.batch6.practice;

public class ThreadPractie {

	public static void main(String[] args) {
		Count c1 = new Count();
		Count c2 = new Count();
		Synchronize core = new Synchronize("Core",c1);
		Synchronize advanced = new Synchronize("Advanced",c1);
		

	}
	
	

}

class Synchronize implements Runnable{

	Count counter;
	Thread t;
	Synchronize(String name, Count c){
		t = new Thread(this, name);
		counter = c;
		t.setName(name);
		t.start();
	}
	
	
	public void run() {
		synchronized(counter){
			System.out.println("Thread started: "+ t.getName());
			counter.counter(t.getName());
			System.out.println("Thread ended:   "+ t.getName());
		}
		
	}
	
}

class Count{
	static int a=0;
	public void counter(String name){
		for(int i=0;i<=5;i++){
			System.out.println("Count class"+name+" count"+a++);
		}
	}
}