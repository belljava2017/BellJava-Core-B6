
public class HelloWorld {

	final static double c=10.0;
	public static void main(String[] args) {
		int a =123212; // Decimal integer literal 0 -9
		int b =01237; //Octal Integer literal 0 -7
		int c =0x123A;  // Hecta Integer Literal 0 -9 and A -F 
		int d =0b11010;  // Binary Integer Literal
		
		double e = 123.3;  // Floating Decimal Notation
		double f = 1.233e2; // Floating Exponentail Notation
		
		char g = '@'; // Chracter Literal
		
		String firstName = "Sisasa23232@#@va"; // String Literals
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		System.out.println(e);
		System.out.println(f);
		
		
		// Arthemetic Operations
		int value1 = 10;
		int value2 = 20;
		
		int add = value1+value2;
		int mul = value1*value2;
		double div = value1/value2;
		int per = value1%value2;
		System.out.println(add);
		System.out.println(mul);
		System.out.println(div);
		System.out.println(per);
		
		if(value1!= value2){
			System.out.println("both are not equal");
		}else{
			System.out.println("both are  equal");
		}
		
		if(value1 > value2){
			System.out.println("value1 is bigger");
		}else{
			System.out.println("value2 is bigger");
		}
		//  (expression)?true:false
		String result = (value1>value2)?"value1 is bigger":"value2 bigger";
		System.out.println(result);
		
		
		//Logical And (&&), Logical OR (||)
		
		int x =1;
		int y =2;
		
		if((x==1)||(y==1)){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
		
		
		
		
	}

}
