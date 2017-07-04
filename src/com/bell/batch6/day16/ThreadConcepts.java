package com.bell.batch6.day16;

import com.bell.batch6.day16.MyThread;

public class ThreadConcepts {

	public static void main(String[] args) {
		 MyThread t1 = new MyThread("Java");
		   MyThread t2 = new MyThread("Scala");
		   MyThread t3 = new MyThread("NodeJS");
		   MyThread t4 = new MyThread("Angular");

	}

}

class MyThread  extends Thread{
	
	static int x = 99;
	static int y = 99;
	
	public MyThread(String tName){
		setName(tName);
		start();
	}
	
	public  void run(){
		
		for (int i=0;i<10;i++){
			y++;
			System.out.println(getName() + " y=" +y);
			synchronized(this){
			x++;
			System.out.println(getName() + " x=" +x);
			}
			
			/*try{
				if(getName().equals("Java")){
					Thread.sleep(2000);
					
				}
				
			}catch(InterruptedException e){
		           e.printStackTrace();
			 }*/
		  }
		}
	
	
	
}