//1.2
public class ClsInter1 extends Thread {
	public String SPattern="";
	public boolean lBlnIsDone=false;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		try {

			System.out.println("I am in thread 1");
			
			for(int i=0;i<20;i++)
			{
				SPattern=SPattern + i +" - ";
				System.out.println("Current Pattern in thread 1 : " + SPattern);
				Thread.sleep(400);
				System.out.println("Still working on pattern creation in thread 1...........");
				
			}
			
			lBlnIsDone=true;
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	
	
	
	}

}
