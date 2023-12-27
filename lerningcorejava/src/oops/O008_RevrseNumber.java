package oops;

import java.util.Scanner;

public class O008_RevrseNumber
{
    public static void main(String[] args)
    {
    	int n,r;
		System.out.println("enter any number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
    	while(n>0)
    	{
    		r=n%10;
    	    System.out.print(r);
    	    n=n/10;
    	}
	}
}
