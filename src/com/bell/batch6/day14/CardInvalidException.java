package com.bell.batch6.day14;

public class CardInvalidException extends RuntimeException {
	String number;
	
	CardInvalidException(){
		
	}
	
	CardInvalidException(String num){
		number =num;
	}
	
	public String toString(){
		if(number!=null){
			return "Invalid card number, card NUmber must be of size 16 but you entered "+ number;
		}
	  return "Invalid card number, card NUmber must be of size 16";
	
	}

}
