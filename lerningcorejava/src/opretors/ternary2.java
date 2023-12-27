package opretors;

public class ternary2 
{
       public static void main(String[] args)
       {
		
    	   // condition true:false
    	   
    	 int a=10;
    	 int b=20;
    	 int c=30;
    	 int str;
    	 
    	 str = (a>b) ? (a>c ? a:c) : (b>c ? b:c);
    	 System.out.println(str);	 
    	 
    	 }
}
