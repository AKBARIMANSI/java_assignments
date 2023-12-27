package ASSIGNMENT;

import java.util.Scanner;

public class Que_8_programe
{
    public static void main(String[] args)
    {
		Scanner r=new Scanner(System.in);
		{
			String str;
			System.out.println("enter the string :- ");
			str = r.nextLine();	
			
			char ch[]=str.toCharArray();
			int letters=0, spaces=0, numbers=0, others=0;
			
			for(int i=0;i<str.length();i++)
			{
				if(Character.isLetter(ch[i]))
				{
					letters++;
				}
				else if(Character.isSpaceChar(ch[i]))
				{
					spaces++;
				}
				else if(Character.isDigit(ch[i]))
				{
					numbers++;
				}
				else
				{
					others++;
				}
			}
			System.out.println("string  are :-  "+str);
		    System.out.println("letters are :- " +letters);		
		    System.out.println("spaces  are :-  "+spaces);
		    System.out.println("numbers are :- " +numbers);
		    System.out.println("others  are :-  "+others);		
		}
     }
}
