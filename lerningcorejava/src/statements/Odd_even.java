package statements;

import java.util.Scanner;

public class Odd_even
{
      public static void main(String[] args)
      {
		  
    	  int n;
    	  System.out.println("enter number");
    	  Scanner sc=new Scanner(System.in);
    	  n=sc.nextInt();
    	  
    	  if(n%2==0)
    	  {
    		 System.out.println("even number"); 
    	  }
    	  else
    	  {
    		  System.out.println("odd number");
    	  }
	}
}
