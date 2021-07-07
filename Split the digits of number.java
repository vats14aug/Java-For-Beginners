import java.util.Scanner;
public class Split {

	public static void main(String[] args) {
		int x=0,i=0,j=0,rem=0;
					int store[]=new int[1000];
					Scanner sc= new Scanner(System.in);
					System.out.println("Enter any number");
					int a=sc.nextInt();
					x = a;
						while(a!=0)
						   {
							
							rem=a%10;
							store[i]=rem;		
							a/=10;
							i++;
						   }
					System.out.println("Number is  "+x);
					System.out.println("REM is  "+rem);
					System.out.println("Digits are  ");
					for(j= i-1 ; j >= 0 ; j--)
					{
					System.out.println(store[j]);
					}	
			
	}

}
