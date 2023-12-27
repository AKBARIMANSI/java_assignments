package opretor2.o;

import java.util.Scanner;

public class O2opretor 
{
    public static void main(String[] args) 
    {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value");
		int a=sc.nextInt();
		System.out.println("enter value");
		int b=sc.nextInt();
		System.out.println("value name");
		String name=sc.next();
		
		System.out.println(a!=b);
		System.out.println(a%b);
		System.out.println(a==b);
		System.out.println("me"+a+b);
		System.out.println(true && false);
		System.out.println(a>b);
		System.out.println(a+"me");
	}
}
