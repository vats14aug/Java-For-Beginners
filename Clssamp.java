package com.inheritance;

public class Clssamp  
{
	 public Clssamp()
	{
		i=10;
		x=25;
	}
	 public Clssamp(int a)
		{
			i=10;
			x=a;
		}
		
		public Clssamp(int a,int b)
		{
			i=a;
			x=b;
		}
	
	private int i;
	private int x;
	public int getSum()
 {
	return(i+x);
 }
}

