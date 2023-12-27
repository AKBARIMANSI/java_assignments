package opretors;

import java.util.Scanner;

public class scannerdemo 
{
     public static void main(String[] args)
     {
		  
    	  Scanner sc=new Scanner(System.in);
    	  System.out.println("enter value for A");
    	  int a= sc.nextInt();
    	  System.out.println("enter value for B");
    	  int b= sc.nextInt();
    	  System.out.println("enter name");
    	  String name = sc.next();
    	 
    	 System.out.println(a+b);
    	 System.out.println(a-b);
    	 System.out.println(a*b);
    	 System.out.println(a/b);
    	 System.out.println(a%b);
    	 System.out.println(name);
    	 
      }
}
