package com.threading;

public class MyThread1 extends Thread {
	String str;
	MyThread(String str)
	{
		this.str=str;
	}
	public void run()
	{	try{
		for(int i=0;i<5;i++)
		{
			System.out.println(str);
			Thread.sleep(2000);
		}
	}
	
	catch(Exception e)
	{
		
	}
	}
	
	public static void main(String []args)
	{
		MyThread mt1=new MyThread("Editing");
		MyThread mt2=new MyThread("Typing"
				);
		Thread t=new Thread(mt1);
		Thread t1=new Thread(mt2);
		t.start();
		t1.start();
	}
}
