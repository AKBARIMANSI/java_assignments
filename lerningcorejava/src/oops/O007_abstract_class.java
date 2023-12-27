package oops;

abstract class animal1
{
	animal1()
	{
		System.out.println("all animal..");
	}
	public abstract void eat();
}
class dog1 extends animal1
{
	dog1()
	{
		super();
	}
	public void eat()
	{
		System.out.println("dog is eating ");
	}
}
class lion1 extends animal1
{
	public void eat()
	{
		System.out.println("lion ia eating");
	}
}

class O007_abstract_class 
{
     public static void main(String[] args) 
     {
		dog1 d=new dog1();
		lion1 l=new lion1();
		d.eat();
		l.eat();
	}
}
