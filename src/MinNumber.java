import java.util.Scanner;


public class MinNumber {

	public static void main(String[] args) {
		//int a=50, b=40, c=30, d=55;
		System.out.println("Please enter 4 numbers, so that I can find you minmum number among those");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a");
		int a = scan.nextInt();
		System.out.println("Enter b");
		int b = scan.nextInt();
		System.out.println("Enter c");
		int c = scan.nextInt();
		System.out.println("Enter d");
		int d = scan.nextInt();
		
		
		if(a<=b && a<=c && a<=d){
			System.out.println("a is the minimum number");
		}else if(b<=a && b<=c && b<=d){
			System.out.println("b is the minimum number");
		}else if(c<=a && c<=b && c<=d){
			System.out.println("c is the minimum number");
		}else{
			System.out.println("d is the minimum number");
		}

	}

}
