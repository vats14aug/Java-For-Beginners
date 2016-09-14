
public class Clsmain {
	public static void main(String []args)
	{
		try{
			
		
		Clsthrd obj=new Clsthrd();
		Thread t1=new Thread(obj); 
		t1.setName("Thread1");
		t1.start();
		
		//##################
		System.out.println("Thread name is : "+(Thread.currentThread().getName()));
		
		/*for(int i=0;i<5;i++)
		{
			System.out.println(" I am in parent ");
		Thread.sleep(1000);
		}*/
		
		}
		catch(Exception e)
		{
			
		}
		finally{
			System.out.println(" Main Thread got killed");
		}
		}
	}
