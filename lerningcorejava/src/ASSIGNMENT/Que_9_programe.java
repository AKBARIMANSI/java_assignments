package ASSIGNMENT;

import java.util.Scanner;

public class Que_9_programe
{
    public static void main(String[] args)
    {
	    char ch;
	    System.out.println("enter any character");
    	Scanner r=new Scanner(System.in);
    	ch=r.next().charAt(0);
    	int a=ch;
    	System.out.println("ASCII value of "+ch +" is " + a);
	}
}
