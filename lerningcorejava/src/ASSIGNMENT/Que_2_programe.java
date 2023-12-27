package ASSIGNMENT;

import java.util.Scanner;

public class Que_2_programe 
{
   public static void main(String[] args)
   {
	  char ch;
	  System.out.println("enter any character");
	  Scanner r=new Scanner(System.in);
	  ch=r.next().charAt(0);
	  
	  if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u')
	  {
		  System.out.println("vowel charater");
	  }
	  else
	  {
		  System.out.println("consonant character");
	  }
   }
}
