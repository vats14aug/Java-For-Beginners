//CONSTRUCTORS
//In this program I have created 4 objects of same class, lets see the output
public class Constructor {

	Constructor()
	{
		System.out.println("Class Constructor is called");
	}
	public static void main(String []args)
	{
	
		Constructor c= new Constructor();
		Constructor c1= new Constructor();
		Constructor c2= new Constructor();
		Constructor c3= new Constructor();
	}
//The output is 4 times constructor called as we created 4 objects//	
}
