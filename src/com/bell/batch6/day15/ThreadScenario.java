package com.bell.batch6.day15;

public class ThreadScenario {

	public static void main(String[] args) {
	   MyThread t1 = new MyThread("Java");
	   MyThread t2 = new MyThread("Scala");
	   MyThread t3 = new MyThread("NodeJS");
	   MyThread t4 = new MyThread("Angular");
       
	}

}

class MyThread  extends Thread{
	
	 int x = 99;
	
	public MyThread(String tName){
		setName(tName);
		start();
	}
	
	public void run(){
		for (int i=0;i<10;i++){
			x++;
			System.out.println(getName() + " " +x);
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
