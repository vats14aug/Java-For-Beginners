//one abstract class can inherit other abstract clss

abstract class First
{
	public abstract void add();
}

abstract class Second extends First
{
	public abstract void sub();
}
public class Paras extends Second {
	public void add()
	{
		
	}
	public void sub()
	{
		
	}
public static void main(String []args)
{
	Paras P=new Paras();
	P.add();
	P.sub();
}
}
