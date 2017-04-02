package test;
import java.io.*;
public class anagram {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
		
		System.out.println("Enter the Strings");
		String s1=br.readLine();
		String s2=br.readLine();
		char ch[]=s1.toCharArray();
		char ch1[]=s2.toCharArray();
		int a[] = new int[500];
		for(int i=0;i<500;i++)
			a[i]=0;
		
		for(int j = 0	;	j < s1.length() || j < s2.length()	;	j++)
		{
			a[ch[j]] += 1;
			a[ch1[j]] -= 1;
			
		}
		/*
		for(int j = 0	;	j < 500	;	j++)
		{
			System.out.print(a[j]);
		}
		*/
		int flag = 0;
		for(int i = 0 ; i < 500 ; i++)
			
		{
			if(a[i] != 0)
				flag = 1;
		}
		if(flag == 1)
			System.out.println("Words aren't anagram");
		else
			System.out.println("Words are anagram");
		
		
		


		
		
	}

}
