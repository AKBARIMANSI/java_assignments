package oops;

class pen
{
	String color;
	String company;
	
	public void write()
	{
		System.out.println("write in pepar");
		
	}
	public void printcolor() 
	{
		System.out.println(this.color);
		System.out.println(this.company);
	}
}
public class O006_constructor
{
   public static void main(String[] args)
   {
	    pen pen1=new pen();
	    pen1.color="blue";
	    pen1.company="sello";
	    
	   pen pen2=new pen();
	   pen2.color="black";
	   pen2.company="saino softack";
	   
	   pen1.printcolor();
	   pen2.printcolor();
	    
   }
}
