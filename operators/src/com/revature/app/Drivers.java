package com.revature.app;

public class Drivers {
	
	public static void main(String[] args) {
		/*
		 * Binary Arithmetic Operators 
		 * 
		 * +: Addition
		 * -: Subtraction 
		 * x: Multipliction
		 * %: Modulus
		 */
		
		// /: Division
		
		int x = 10;
		int mySum = x + 20; 
		System.out.println("mySum: " + mySum);
		
		int myDifference = mySum - 25; 
		System.out.println("myDifference: " + myDifference);
	
		byte byte1 = 10;
		byte byte2 = 3;
		
	byte myByte = (byte) (byte1 + byte2); // byte + byte ->	int + int =int
	System.out.println("myByte:" + myByte);
	
	}

}
