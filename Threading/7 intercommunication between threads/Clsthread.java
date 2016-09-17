package com.threading;

public class Clsthrd extends Thread {

	
	public void run()
	{
		super.run();
		try {
			
			System.out.println("CHILD THREAD"+Thread.currentThread().getName());
			int i=0;
			for(;;)
				
			{
				try {
					int a=90;
					int b=0;
					
					b=a/i;
					
					
					i++;
					
					
					
				} catch (Exception e) {
					i++;
					System.err.println("Loo excetion : "+e.getMessage());
					continue;
				
			
			
				}
				finally{
					System.out.println();
					System.out.println(" I am in finalyy");
					
					System.out.println(" Value of I  "+i);
					if(i==20)
					{
						System.out.println("I value is overdue ;"+i);
						System.out.println();
						
						break;
					}
				}
			}
	
				System.out.println("I am out of Loo");
		}
		catch(Exception e)
		{
				System.err.println("ERROR IN THREAD : "+e.getMessage());
				
		}
		finally{
			System.out.println("Thread 1 got killed");
		}
	}
}

		