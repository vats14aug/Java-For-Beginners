//POLYMORPHISM EXAMPLE
public class Cons5 {
	Cons5()
	{
		System.out.println("Default Constructor");
	}
	Cons5(int a, int b)
	{
		System.out.println("ADD IS "+(a+b));
	}
	
	Cons5(String str)
	{
		System.out.println(str);
			
	}
	public static void main(String []args)

{
	Cons5 c=new Cons5();
	Cons5 c1=new Cons5(5,4);
	Cons5 c2=new Cons5("vatsal");
}
}
        
