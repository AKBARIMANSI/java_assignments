package ASSIGNMENT;

import java.util.Scanner;

public class Que_5_programe
{
  public static void main(String[] args)
	 {
	    Scanner sc=new Scanner(System.in);
			
		int row;
		System.out.println("enter traingal numer :");
		row=sc.nextInt();
			
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
				System.out.println();
			}
	 }
}
