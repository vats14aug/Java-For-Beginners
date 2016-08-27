//Command Line Agrguments
//When we pass argument on run time to main function
public class CmdLineArg {

	public static void main(String []ar)
	{
		int a=ar.length;
		System.out.println("number of items"+a);
		int sum=0;
		for(int i=0;i<a;i++)
			sum=sum+Integer.parseInt(ar[i]);
		System.out.println("TYotal Cost"+sum);
		
	}
}
