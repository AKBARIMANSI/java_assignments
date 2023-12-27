package ASSIGNMENT;

import java.util.Scanner;

public class Que_4_programe
{
    public static void main(String[] args)
    {
		int count;
		System.out.println("enter count of number :");
		Scanner r=new Scanner(System.in);
		count =r.nextInt();
		int number ,sum=0;
		float average=0;
		for(int i=0;i<count;i++)
		{
			number =r.nextInt();
			sum=sum+number;
		}
		average=sum/count;
		System.out.println("sum of enter number : " + sum);
		System.out.println("average of enter number : " + average);	
    }
}

