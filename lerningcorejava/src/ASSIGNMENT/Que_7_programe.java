package ASSIGNMENT;

import java.util.Scanner;

public class Que_7_programe
{
   public static void main(String[] args)
   {
	 int n,count=0;
	 System.out.println("enter any number");
	 Scanner r=new Scanner(System.in);
	 n=r.nextInt();
	 
	 while(n>0)
	 {
		 n=n/10;
		 count++;
	 }
	  System.out.print("no of digits : "+count); 
	   
   }
}
