package test;
import java.io.*;
public class DuplicateCleverApproach {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
		
		System.out.println("Enter the Strings");
		String s1=br.readLine();
		char ch[]=s1.toCharArray();
		int a[] = new int[500];
		for(int i=0;i<500;i++)
			a[i]=0;
		
		for(int j = 0	;	j < s1.length()	;	j++)
		{
			a[ch[j]] += 1;
			
		}
		for(int i=0;i<500;i++)

		{
			if(a[i]>=2)
			{
				System.out.println("Duplicate character is "+ (char)(i)+"  Repeated ["+a[i]+"]  times");
			}
		}

		
	}

}
