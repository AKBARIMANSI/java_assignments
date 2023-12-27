package oops;
                     // SIMPAL INHERITANCE //
class student
{             
    int rollnumber;
	int marks;
	String name ;
	void input()
	{
		System.out.println("enter rollnumber & marks & name");
	}
}
class mansi extends student
{
	void display()
	{
		
		rollnumber=1;
		marks=100;
		name="mansi";
		System.out.println(rollnumber+" "+marks+" "+name);
	}
}
public class O005_inheritance
{
	public static void main(String[] args)
    {
		mansi mansi=new mansi();
		mansi.input();
		mansi.display();
		
	}
}

                    