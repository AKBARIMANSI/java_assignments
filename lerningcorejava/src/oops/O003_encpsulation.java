package oops;

abstract class Animal
{
	abstract void walk();
	Animal()
	{
		System.out.println("new creatinga a animal");
	}
	public void eat()
	{
		System.out.println("animal eats");
	}
}

class house extends Animal
{
	house()
	   {
		   System.out.println("creating a house");
	   }
	public void walk()
	{
		System.out.println("house is walk");
	}
}

class cow extends Animal
   {
	cow()
	{
		System.out.println("creating a cow");
	}
	public void walk()
	{
		System.out.println("cow is walk");
	}
}

public class O003_encpsulation 
{
   public static void main(String[] args)
   {
	   
	   cow cow=new cow();
	   
   }
}
