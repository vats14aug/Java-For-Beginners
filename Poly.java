//POLYMORPHISM STATIC
public class Poly {
public static int add(int a, int b)
{
	return (a+b);
}
public static double add(double a, double b)
{
	return (a+b);
}
public static float add(int a, int b, int c)
{
	return (a+b+c);
}
class User
{
	public static void main(String []args)
	{
		System.out.println("Add is "+Poly.add("mit","mbd"));
	}
	
}
}
