//1.3
public class ClsInter2 extends Thread{

	ClsInter1 lobj=null;// we created an instance of clsinter1
	ClsInter2(ClsInter1 aobj)
	{
		 lobj=aobj;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
	 try {
		 System.out.println("I am in thread 2");
		 
		 while(!lobj.lBlnIsDone) //till lblnisdone is false
		 {
			 System.out.println("Waiting for pattern to complete");
			Thread.sleep(350);
		 }
		 System.out.println("Pattern in now ready");
		 System.out.println("I am in thread 2 : ");
		 System.out.println("Printing in thread 2"+lobj.SPattern);
		 
		 
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	
	
	}
	
	
	
}
