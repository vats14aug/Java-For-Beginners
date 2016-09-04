package com.inheritance;

public class ClsException {
public static void main(String []args)
{ int i=0;
	printline(i);
}
 public static void printline(int a)
 
 { int z=0;
	 try {
	
		 int x=20;
        z=x/a;

	 	} 
	   catch (Exception e) {
		
	 // TODO: handle exception
	System.err.println("Got Exception : "+ e.getMessage());
	z=15;
	   }
 System.out.println("Result is"+z);
 System.out.println("Clear");
 }
 
}
