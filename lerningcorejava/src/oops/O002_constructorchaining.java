package oops;

class A
{
	public A()
	{
		System.out.println("a");
	}
}
class B extends A
{
	public B()
	{
		this(10);
		System.out.println("b");
	}
	public B(int i)
	{
		System.out.println("b1");
	}
}

public class O002_constructorchaining 
{
   public static void main(String[] args)
   {
	  B b=new B();
   }
}
