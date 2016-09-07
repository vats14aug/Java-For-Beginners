package com.threading;

public class MyThread extends Thread {
	
	public void run()
	{
		for(int i=0;i<5;i++)
			System.out.println("Run Method");
	}
	
	public static void main(String []args)
	{
		MyThread mt=new MyThread();
		Thread t=new Thread(mt);
		t.start();
		
	}
