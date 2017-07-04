package com.bell.batch6.day12;

public class ObjectDemo{

	public static void main(String[] args) {
		/*int a = 10;
		int b= 10;
		
		if(a==b){
			System.out.println("same");
		}
		
		*/
		
		JavaStudent js2 = new JavaStudent("santosh", "Advanced", 400);
		
		System.out.println(js2);
		System.out.println(js2.hashCode());
		
		JavaStudent js3 = new JavaStudent("santosh", "Advanced", 200);
		
		System.out.println(js3);
		System.out.println(js3.hashCode());
		
		if(js2 == js3){
			System.out.println("== comparision and result true");
		}else{
			System.out.println("== comparision and result false");
		}
		
		if(js2.equals(js3)){
			System.out.println("JavaStudent  class overriden .equals comparision and result true");
		} else{
			System.out.println("JavaStudent class overriden .equals comparision and result false");
		}
		}
		
		

}

class JavaStudent{
	
	String name;
	String course;
	int fee;
	JavaStudent(){
		
	}
	
	JavaStudent(String n, String c, int f){
		name = n;
		course = c;
		fee = f;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	@Override
	public String toString() {
		return "JavaStudent [name=" + name + ", course=" + course + ", fee="
				+ fee + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((course == null) ? 0 : course.hashCode());
		result = prime * result + fee;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	 public boolean equals(Object otherObject) {
		 
		  JavaStudent js = (JavaStudent)otherObject;
		  String oCourse = js.getCourse();
		  int oFee = js.getFee();
		  String oName = js.getName();
		 if( this.name.equals(oName)){
			 return true;
		 }
		  
		 return false;
	 }
	
	
	
}
