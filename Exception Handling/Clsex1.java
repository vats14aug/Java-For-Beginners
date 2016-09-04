

package com.inheritance;

public class Clsex1 {
	public static void main(String []args)
	{
		met1();
	}
	public static void met1()
	{	int z=0;
		int x=0;
		try {
			int i=10;
			 z=i/2;
			//################
			
			int[] a=new int[2];
			a[0]=1;
			a[1]=2;
			x=a[3];
			
			//#################
						
		}
		catch(ArithmeticException a){
			System.err.println(a.getMessage() );
			
			System.out.println("Artihmetic exception Catch block");
		}
		
		catch(ArrayIndexOutOfBoundsException ao){
			System.err.println(ao.getMessage() );
			
			System.out.println("ArrayIndexOutOfBounds Catch block");
				
		}
		catch (Exception e) {
			System.err.println(e.getMessage() );
			System.out.println("Generic Exception Catch block");
			
		}
		
		System.out.println("Z is :"+z);
		System.out.println("X is :"+x);
		
		
	}
}
