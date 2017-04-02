package test;
import java.util.Scanner;
public class SubArrayWithGivenSum {
	public static void main (String []args)
	{		Scanner sc=new Scanner(System.in);
			//int a[] = new int[5];
			int arr[] = {0, 1, 2, 3, 1, 5};
	 		System.out.println("Enter sum u want to find");
	 		int sum=sc.nextInt();
	 		int sum1;
	 		for(int i=0;i<6;i++)
	 		{
	 			sum1=arr[i];
	 			for(int j=i+1;j<6;j++)
	 			{
	 				
	 			sum1=sum1+arr[j];
	 			if(sum1==sum)
	 				System.out.println("The sum is find between array of indexes "+i+" and "+j);
	 			
	 			else if(sum1>sum)
	 				break;
	 				
	 			}
	 		}
	 		

	}
}
