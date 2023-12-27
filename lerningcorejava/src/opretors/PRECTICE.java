package opretors;

public class PRECTICE
{
    public static void main(String[] args)
    {
    	   // unary opretor
    	
    	int a=10;
    	int b=90;
    	 System.out.println(a+b);
		 System.out.println(a+"true");
		 System.out.println(a+b+"true");
		 System.out.println("true"+a+b);
		 System.out.println("****************************************");
		    
		  // arithmetic opretor
		 
		 System.out.println(a*b);
    	 System.out.println(a/b);
    	 System.out.println(a-b);
    	 System.out.println(a%b);
    	 System.out.println("****************************************");
    	 
    	  // relational opretor
    	 
    	 System.out.println(a<b);
    	 System.out.println(a!=b);
    	 System.out.println(a==b);
    	 System.out.println(a>b);
    	 System.out.println("*****************************************");
    	 
    	  // logical opretor
    	 
    	 System.out.println(true && true);
    	 System.out.println(false && true);
    	 System.out.println(true && false);
    	 System.out.println(false && false);
    	 System.out.println("                                         ");
    	 
    	 System.out.println(true || true);
    	 System.out.println(false || true);
    	 System.out.println(true ||  false);
    	 System.out.println(false || false);
    	 System.out.println("******************************************");
    	 
    	  // ternary opretor
    	 
    	 String str = (a>b) ? "A is lessthen" : "B is lessthen";
         System.out.println(str);
     }
}
    	
class greatest
{
	public static void main(String[] args) 
	{
		
		int a= 20;
		int b= 30;
		int c= 50;
		
		if(a>b)
		{
			if(a>c)
				System.out.println(a);
			else
				System.out.println(c);
			
		}
		else
		{
			if(b>c)
				System.out.println(b);
			else
				System.out.println(c);
		}
	}
} 	
    	
    	

