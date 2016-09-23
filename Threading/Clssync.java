
public class Clssyncex {
	
	public static void main(String[] args) {
		try {
			
			new Clssyncex().usesyncex();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	

	int mIntTicker=0;
	Object objLock=null;
	

	public synchronized void  addup()
	{	synchronized (objLock) {

		mIntTicker++;
	}

	
	}
	
	
	public void  usesyncex()
	{
		try {
			objLock=this;

			System.out.println("Initial COunt : "+mIntTicker);
			
		Thread t1=new Thread(
				
				
				new Runnable() {
				@Override
			public void run() {
				// TODO Auto-generated method stub
						for (int i = 0; i < 20000; i++) {
							
							addup();
						}
			                  }
									})	;
		
			//####################
		
		
			Thread t2=new Thread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					for (int i = 0; i < 20000; i++) {
						
						addup();;
						}
								
				}
			})
		;
		
			//###################
		
		
			t1.start();
			t2.start();
			System.out.println("Final COunt : "+mIntTicker);
			Thread.sleep(100);
			//############
			
			
		
		}
			
			
		 catch (Exception e) {
			// TODO: handle exception
		}
	}

}
