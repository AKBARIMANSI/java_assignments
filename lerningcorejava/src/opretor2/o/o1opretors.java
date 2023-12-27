package opretor2.o;

import java.util.Scanner;

public class o1opretors
{
    public static void main(String[] args)
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter A value");
    	int a=sc.nextInt();
    	System.out.println("enter B value");
    	int b=sc.nextInt();
    	System.out.println("enter name");
    	String name=sc.next();
    	
    	System.out.println(a/b);
    	System.out.println(a-b);
    	System.out.println(a+b);
    	System.out.println(a*b);
    }
}
