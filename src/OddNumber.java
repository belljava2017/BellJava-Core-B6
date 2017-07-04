import java.util.Scanner;


public class OddNumber {


	public static void testLater(){
		System.out.println("Testing later");
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		System.out.println("Enter the up to count:");
		int count = scan.nextInt();
		for(int i=1;i<count;i++){
			if(i%2!=0){
				System.out.print(i + ", ");
			}
			
		}
		testNow(10,20.20f, 20.20);
		System.out.println("End of the program");
	}
	
	public static  void testNow(int a,float b, double d){
		
		System.out.println("Testing now"+a);
		
		testLater();
	}
	

}
