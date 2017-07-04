package com.bell.batch6.day16;

public class SynchronizedDemo {

	public static void main(String[] args) {
		Inc c1 = new Inc();
		Inc c2 = new Inc();
		
		DirtyProtector core = new DirtyProtector("Core",c1 );
		DirtyProtector advanced = new DirtyProtector("Advanced",c2 );

	}

}


class DirtyProtector implements Runnable {
    
	Inc inc;
	Thread t;
	
	DirtyProtector(String tName, Inc inc){
		this.inc = inc;
		t = new Thread(this,tName);
		t.setName(tName);
		t.start();
	}
	
	public void run() {
	synchronized(inc){
		System.out.println("Thread started " +t.getName());
		   inc.counter(t.getName());	
		   System.out.println("Thread ended: " +t.getName());	
			
	}
	   
	}
	
	
	
}



class Inc{
	static int a =0;
	public void counter(String name){
		for(int i=0;i<=5;i++){
			System.out.println("Counter : Name "+name+" count " + a++);
		}
	}
}