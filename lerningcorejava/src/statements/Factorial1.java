
package statements;

import java.util.Scanner;

public class Factorial1
{
	public static void main(String[] args)
	{
		int n,fact=1;
		System.out.println("enter number");
		Scanner sc=new Scanner(System.in);
	    n=sc.nextInt();
	    
	    {
	    	for(int i=1; i<=n; i++)
	    	fact=fact*i;	
	    }
		System.out.println("factorial : "+ fact);
	}
}

       