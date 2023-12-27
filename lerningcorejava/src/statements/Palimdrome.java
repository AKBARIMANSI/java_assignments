package statements;

import java.util.Scanner;

public class Palimdrome
{
public static void main(String[] args) 
{
	 int n,c,r,arm=0;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter number");
	 n=sc.nextInt();
	 c=n;
	 while(n>0)
	 
	 {
		 r=n%10;
		 arm=(arm*10)+r;
		 n=n/10;
	 }
	 
	 if(c==arm)
	 {
		 System.out.println("palimdrome number");
	 }
	 else
	 {
		 System.out.println("not palimdrome number");
	 }
}
}
