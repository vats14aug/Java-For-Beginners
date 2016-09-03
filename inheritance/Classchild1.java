package com.inheritance;

public class Classchild1 extends ClasChild
{ public int i=250;
	Classchild1(int a,int b)
	{super(a,b);
		
	}
	public int getParentsi()
	{
		return super.i;
	}
	 public int getSum()
	 {
System.out.println("I am in child 1");
		 return(super.i+x);
	 }
}
