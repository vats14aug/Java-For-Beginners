
import java.util.Scanner;
public class test1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter range");
		int a=sc.nextInt();
		int n1=0,n2=1,i,n3;
		System.out.println(""+n1+"\n"+n2);

		//System.out.println(n2);
		for(i=2;i<a;++i)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(n3);
		}
		
	}

}
