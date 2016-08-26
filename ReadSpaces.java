//Count the nummber of spaces
import java.io.*;
public class ReadSpaces {

	public static void main(String []args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
		System.out.println("Enter the string");
		String a=br.readLine();
		char ch[]=a.toCharArray();
		int counter=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==' ')
				counter++;
		}
		System.out.println("Number of spaces are :"+counter);
	
	}
}
