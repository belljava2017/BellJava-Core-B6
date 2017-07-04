package com.bell.batch6.day14;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class UserDefinedExceptionDemo {

	public static void main(String[] args) {
		
		File file = new File("");
		
		try {
			file.createNewFile();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		try{
			System.out.println("Enter Your card Number");
			Scanner scan = new Scanner(System.in);
			String number = scan.next();
			validate(number);
		}catch(CardInvalidException ce){
			System.out.println(ce.toString());
		}

	}
	// USer Entered 16 characters should be digits not alphabets
	// 06/20
	// 3 digit number 
	// Ask kind of card: American then 4 digits cvv and what kind of card also VISA , Master, Disc

	static void validate(String number){
		if(number.length() == 16){
			System.out.println("Hey, Accepted your card, and will send your purchases on 06/30");
		}else{
			throw new CardInvalidException(number);
		}
	}
	
}
