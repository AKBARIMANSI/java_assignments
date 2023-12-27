package homework;

import java.util.Scanner;

public class without_mainmethod
{
   int a,b,sum,sub;
   
   public void input()
   {
	   Scanner r=new Scanner(System.in);
	   System.out.println("enter value of A");
	   a=r.nextInt();
	   System.out.println("enter value of B");
	   b=r.nextInt();
   }
   
   public void calculate() 
   {
	   sum=a+b;
       sub=a-b;  
   }
   
   public void display()
   {
	   System.out.println("sum of A & B = "+sum);
	   System.out.println("sub of A & B = "+sub);
   }
}
