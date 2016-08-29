
public class Cons3 
{
	 int a1,b1;
	Cons3(int a, int b)
	{
		a1=a;
		b1=b;
		print();
	}
	
	public void print()
	{
		System.out.println("a1 is"+a1);
		System.out.println("b1 is "+b1);
	}
	public static void main(String []args)
	{
		Cons3 c3=new Cons3(10,20);
	}
}
//in this if we have used a and b only instead of a1,b1 then we have to use this.a and this.b as compiler get confuse 
