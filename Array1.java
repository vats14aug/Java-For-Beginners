import java.util.Scanner;
public class Array1 {
	public static void main(String []args)
	{	Scanner sc=new Scanner(System.in);
		int a[] = new int[5];
		System.out.println("Enter the array elements");
		for(int i=0;i<5;i++)
			a[i]=sc.nextInt();
		System.out.println(" the array elements are");
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]+"\t");
	}
	

}
