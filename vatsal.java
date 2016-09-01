//abstract method (inheritance)
abstract class Vendor
{
	public abstract void calc(int a);
	public void print()
	{
		System.out.println("Print Method Called");
	}
}

class Vijay extends Vendor
{
	public void calc(int a)
	{
		System.out.println("Square is:"+(a*a));
	}
}
public class Vatsal extends Vendor
{   public void calc(int a)
	{
	System.out.println("Cube is "+(a*a*a));
	}
	public static void main(String []args)
	{
		Vijay V=new Vijay();
		Vatsal v=new Vatsal();
		V.calc(4);
		V.print();
		v.calc(4);
		v.print();
	}
}
