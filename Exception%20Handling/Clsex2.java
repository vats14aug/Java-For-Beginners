package com.inheritance;

public class Clsex2 {
public  static void main(String []args)
{
	int i=24;
	try {
		i=i/0;
		System.out.println("I am in main try");
			try {
				i=i/2;
				System.out.println("I am in nested try");
				
			} catch (ArithmeticException ae) {
				// TODO: handle exception
				System.out.println("Nested Try Method Exception");
				System.out.println("Value of i is : "+i);
				
			}
	} catch (Exception e) {
		// TODO: handle exception
	
		
		System.out.println("Main Method exception");
		
	}
}
}
