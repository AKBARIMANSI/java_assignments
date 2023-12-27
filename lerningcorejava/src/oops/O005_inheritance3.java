package oops;
                                 //MULTIPAL INHERITANCE //
class mix
{
	void show()
	{
		System.out.println("this is class A");
	}
}
class Bix
{
	void show()
	{
		System.out.println("this is class B");
	}
}
interface m
{
	void show();
}
interface x
{
	void show();
}
class O005_inheritance3 implements m,x
{
   public void show()
   {
	   System.out.println("interface A & B ");
   }
   
   public static void main(String[] args)
   {
	   O005_inheritance3 i=new O005_inheritance3();
	   i.show();
	   
   }
}
