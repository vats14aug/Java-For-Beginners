package com.inheritance;

public class ClsException {
public static void main(String []args)
{ int i=0;
	printline(i);
}
 public static void printline(int a)
 
 { int z=0;
	 try {
	
		 int x=10;
        z=x/a;
        System.out.println("No error here");
	 	} 
	   catch (Exception e) {
		
	 // TODO: handle exception
	System.err.println("Got Exception : "+ e.getMessage());
	z=15;
	   }
	 finally{
		 System.out.println("I am finally");
		 
	 }
	 
 	 try {
		 z=5/0;
		 
	} catch (Exception e) {
		System.err.println("Got Exception : "+ e.getMessage());
		z=25;
		// TODO: handle exception
	}
 	 finally{
 		System.out.println("I am 2 finally");
		 
 	 }

	 System.out.println("Result is   "+z);
	 System.out.println("Clear");

  }
 
}
