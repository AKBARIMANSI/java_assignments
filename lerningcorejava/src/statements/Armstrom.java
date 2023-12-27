package statements;

import java.util.Scanner;

public class Armstrom 
{
         public static void main(String[] args)
         {
        	
			Scanner sc=new Scanner(System.in);
			int n,rem,c,arm=0;
			System.out.println("enter any number");
			n=sc.nextInt();
			c=n;
		    while(n>0)
		    {
		       rem=n%10;
		       arm=(rem*rem*rem)+arm;
			   n=n/10;
		    }
			
			if(c==arm)
			{
				System.out.println("armstrom number");
			}
		    else
		    {
				System.out.println("not armstrom number");
			}
			
		 }
}
