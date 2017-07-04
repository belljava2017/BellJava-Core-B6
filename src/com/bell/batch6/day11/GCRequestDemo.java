package com.bell.batch6.day11;

public class GCRequestDemo {

	public static void main(String[] args) {
		//Network connection logic
		
		GCReady ready = new GCReady();
		ready.mtd1();
		ready.mtd2();
		ready = null;
		GCRequestDemo gcDemo = new GCRequestDemo();
		gcDemo = null;
		System.gc();
		


	}

	protected void finalize(){
		// have a logic to release all network connections like DB, XLS, PDF that you estblisehd as partof your program
	  System.out.println("Garbage Collection Thread triggered to clean up memory");
	}

}


class GCReady {
	
	String name ="EXABVVC";
	int y = 11;
	
	public void mtd1(){
		System.out.println("Hey whatsapp");
	}
	
	public void mtd2(){
		System.out.println("Bye Bye");
	}
	
}