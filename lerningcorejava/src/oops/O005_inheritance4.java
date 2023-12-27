package oops;
                              //HIERARCHICAL INHERITANCE //

class P
{
	void input()
	{
		System.out.println("enter your name: ");
	}
}
class Q extends P
{
	void show()
	{
		System.out.println("My Name Is Mansi");
	}
}
class R extends P
{
	void display()
	{
		System.out.println("My Name Is Akbari");
	}
}
public class O005_inheritance4
{
    public static void main(String[] args) {
		Q m=new Q();
		R m2=new R();
		
		m.input();
		m.show();
		m2.input();
		m2.display();
	}
}
