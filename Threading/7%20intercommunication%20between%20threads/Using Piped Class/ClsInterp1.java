import java.io.PipedWriter;

//2.1
public class ClsInterp1 extends Thread {
	PipedWriter lObjPW=null;
	
	ClsInterp1(PipedWriter w)
	
	{
		lObjPW=w ;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		try {
			
			int i=0;
			
			for(;;) //infinite
			{
				try{
					
					
				if(lObjPW!=null){
			
				String lStr="Created @ Parent Level   "+i++ +"..." ;
				lObjPW.write(lStr);
				
						
			}
				Thread.sleep(200);
				}
			
			catch(Exception e){ 
					continue ;
				}
				finally{
					if(lObjPW!=null)
					lObjPW.flush();
				}
			
			
			}
		} 
			catch (Exception e) {
			// TODO: handle exception
		}
	
	
	}

}


