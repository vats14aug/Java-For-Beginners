//Basic Inheritance
package com.inheritance;

public class Clssamp {
public int i=10;
public char ch='C';
public void printline()
{
	System.out.println("PRINTING PARENT");
}
}


public class ClasChild extends Clssamp {
	

}


public class Clsusage {
	public static void main(String []args)
	{
		ClasChild obj=new ClasChild();
		System.out.println(obj.i);
		System.out.println(obj.ch);
		obj.printline();
	}

}
