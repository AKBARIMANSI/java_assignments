package oops;
                             //MULTILEVEL INHERITANCE //
class function1
{
	int a,b,c;
	void add()
	{
		a=10;b=20;
		c=a+b;
		System.out.println("Sum of two Number:"+c);
	}
	void sub()
	{
		a=100;b=200;
		c=a-b;
		System.out.println("Sub of two Number:"+c);
	}
}
class function2  extends function1
{
	void multi()
	{
		a=10;b=20;
		c=a*b;
		System.out.println("multi of two Number:"+c);
	}
	void div()
	{
		a=10;b=2;
		c=a/b;
		System.out.println("div of two Number:"+c);
	}
}

class function3 extends function2
{
	void rem()
	{
		a=10;b=3;
		c=a%b;
		System.out.println("rem of two Number:"+c);
	}
}
public class O005_inheritance2
{
   public static void main(String[] args)
   {
	       function3 r=new function3();
			r.add();
			r.sub();
			r.multi();
			r.div();
			r.rem();
   }
}
