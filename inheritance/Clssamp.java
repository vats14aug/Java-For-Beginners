package com.inheritance;

public class Clssamp  
{
 protected int i=100;
 protected int x=200;
 public int getSum()
 {
	 return(i+x);
 }
 public Clssamp(int a)
 {
	 this(10,a);
	 i=1000; 
 }
 public Clssamp(int a,int b)
 {
	 i=a;
	 x=b;
 }
}
