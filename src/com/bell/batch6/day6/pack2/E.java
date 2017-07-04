package com.bell.batch6.day6.pack2;

import com.bell.batch6.day6.pack1.A;

public class E {
	
	void method(){
		A aObj = new A();
		
		System.out.println(aObj.x); //public good
		//System.out.println(aObj.y); // default not accessible
		//System.out.println(aObj.z); //protected not good
		//System.out.println(aObj.p);  // private not good
	}

}
