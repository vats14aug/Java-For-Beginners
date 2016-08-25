//maximum in an array
import java.util.Scanner;
public class Array3 {
	public static void main(String []args)
	{	Scanner sc=new Scanner(System.in);
		int a[] = new int[5];
		int max=0;
		System.out.println("Enter the array elements");
		for(int i=0;i<5;i++)
			a[i]=sc.nextInt();
		System.out.println(" the array elements are");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+"\t");
		for(int i=0;i<a.length;i++)
			{
			max=a[i];
			if(max>=a[i])
				a[i]=max;
			}
		System.out.println(" the MAX array element IS\t"+max);
			
	}
	

}
