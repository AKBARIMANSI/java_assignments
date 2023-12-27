package ASSIGNMENT;

import java.util.Scanner;

public class Que_6_programe
{
   public static void main(String[] args) 
   {
	   int k=1;
	   Scanner r=new Scanner(System.in);
	   System.out.println("enter row value");
	   int n=r.nextInt();
	   
	   for(int i=1;i<=n;i++)
	   {
		   for(int j=1;j<=i;j++)
		   {
			   System.out.print(k++);
		   }
		   System.out.println();
	   }
	   
   }
}
