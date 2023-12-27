package oops;
                          // Method of overloading //
public class O004_polymorphism1
{
	
	public static void main(String[] args)
    {
    	AAA aaa=new AAA();
		aaa.add();
		aaa.add(100,200);
		aaa.add(10,20.222);
	}
	
}

 class AAA
{
	 void add()
		{
			int a=10,b=20,c;
			c=a+b;
			System.out.println(c);
		}
		void add(int x,int y)
		{
			int c;
			c=x+y;
			System.out.println(c);
		}
		void add(int x,double y)
		{
			double c;
			c=x+y;
			System.out.println(c);
		}
}
