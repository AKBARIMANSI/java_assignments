package collation;

import java.util.ArrayDeque;

public class stack
{
   public static void main(String[] args) 
   {
	   
	ArrayDeque<String> name=new ArrayDeque<String>();
	name.push("mansi");
	name.push("akshar");
	name.push("hardik");
	   
	System.out.println(name);   
	name.pop();
	System.out.println(name);
	   
    }
}
