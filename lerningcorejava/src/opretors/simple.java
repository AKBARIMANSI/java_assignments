package opretors;

import java.util.Scanner;

public class simple 
{
     public static void main(String[] args)
     {
		
     Scanner sc=new Scanner(System.in);
     System.out.println("enter value");
     int a=sc.nextInt();
     System.out.println("enter value");
     int b=sc.nextInt();
     System.out.println("name");
     String name=sc.next();
     
     System.out.println(a+b);
     System.out.println(a-b);
	 System.out.println(a*b);
	 System.out.println(a/b);
	 System.out.println(a%b);
	 System.out.println(name);
     }
}
