import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
class Ascii
{
public static void main(String []args) throws IOException
{
 
BufferedReader br= new BufferedReader( new InputStreamReader (System.in));
System.out.println("Enter the character");
char ch=br.readLine().charAt(0);
System.out.println("The Ascii value is :"+(byte)ch);


}
}
