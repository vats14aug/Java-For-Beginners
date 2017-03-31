
import java.util.Scanner;
public class FibbonacciRecursion {
	static int  n1=0,n2=1,n3;
	
		 static void fib(int n)
		{
			if(n>0)
			{
				n3=n1+n2;
				n1=n2;
				n2=n3;
			System.out.println(n3);
				fib(n-1);
			}
			
		}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("ENTER RANGE");
		n=sc.nextInt();
		System.out.println("N is "+n);

		fib(n-2);
		
	
		}
		
	

}
