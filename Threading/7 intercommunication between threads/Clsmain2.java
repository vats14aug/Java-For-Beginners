//Communication between two threads using our own logic !!
public class Clsmain2 {
public static void main(String[] args) {
	try {
		ClsInter1 obj=new ClsInter1();
		Thread t1=new Thread(obj); //same copy of clsinter 1 is passing to thread  
		Thread t2=new ClsInter2(obj); //same copy of clsinter 1 is passing to 2nd thread as argument so whatever is happening at inter1   
										//will be tracked to inter2
		
		
		t1.start();
		t2.start();
		
		
	} catch (Exception e) {
		// TODO: handle exception
	}
}
}
