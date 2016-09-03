package com.inheritance;

public class Classchild2 extends Classchild1 {
	public int i=90;
	Classchild2(int a , int b){
		super(a,b);
	}
	public void printsupersi()
	{ i=super.getParentsi();
		System.out.println(i);
	}



}
