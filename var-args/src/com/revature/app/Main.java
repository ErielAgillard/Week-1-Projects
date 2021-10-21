package com.revature.app;

public class Main {
	
	public static void main(String... args) {
		
		System.out.println(getSum(10.5,5.757));
		
		System.out.println(getSum(1.5,2.5,3.2,4.5,10,11.1,15,1000,2000));
		
	}
	
	public static double getSum(double a, double b) {
		System.out.println("getSum with 2 doubles invoked");
		return a+b;
	}
double sum= 0;
}
