package com.bell.batch6.day8;

public class InterfaceDemo {

	public static void main(String[] args) {
		
		Vehicle v = new JetPlane();
		v.engine();
		v.wheels();
		v.speed();

	}

}

interface Vehicle{
	public abstract void engine();
	void speed();
	void wheels();
}

abstract class Plane implements Vehicle{
	public void engine(){
		System.out.println("Plane Engine");
	}
	public abstract void speed();
	public void wheels(){
		System.out.println("9 wheels");
	}
}

class Boeing extends Plane{

	@Override
	public void speed() {System.out.println("330 mph");
	}
	
}

class JetPlane extends Plane{

	@Override
	public void speed() {System.out.println("100 mph");
	}
	
}
