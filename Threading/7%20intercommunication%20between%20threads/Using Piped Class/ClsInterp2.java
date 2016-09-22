//import java.io.PipedWriter;
import java.io.PipedReader;

public class ClsInterp2 extends Thread{
	
	PipedReader lObjPR=null;
	 
	
	public ClsInterp2(PipedReader r)
	{
		lObjPR=r;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		try {
			while(true)
			{
				try {
					if(lObjPR!=null) {
					//char lchrRead=(char )lObjPR.read();

					
					int iIntRead= lObjPR.read();
					if(iIntRead !=-1)
					{
						char lChrData=(char)iIntRead;
						
						System.out.print(lChrData);
					}
					Thread.sleep(100);	
					}		
					
				} catch (Exception e) {
					
					continue;
					// TODO: handle exception
				}
			}
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		finally{
			System.out.println("Out of thread 2 ");
		}
	
	
	}
	
}
