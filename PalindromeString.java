//to check whether the string is Palindrome or not
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
	
public class PalindromeString {

		public static boolean isPalindrome(char ch[])
		{
			int start=0;
			int end=ch.length-1;
			while(start<end)
			{
				if(ch[start]==ch[end])
				{
					start++;
					end--;
			
				}

				else 
				return false; 
				
			}
				return true;			
		}	
		

		public static void main(String []args) throws IOException
		{
			BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
			System.out.println("Enter the string");
			String a=br.readLine();
			char ch[]=a.toCharArray();
			if(isPalindrome(ch))
				System.out.println("String is Palindrome");
			else
				System.out.println("String is Not Palindrome");
				
		}
	}


