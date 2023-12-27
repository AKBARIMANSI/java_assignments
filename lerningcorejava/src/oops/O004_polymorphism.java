package oops;
                      //Method of overriding //
class shape
{
	void draw()
	{
		System.out.println("shape of type");
	}
}
class square extends shape
{
	void draw()
	{
		super.draw();
		System.out.println("square shape");
	}
}
public class O004_polymorphism
{
    public static void main(String[] args) {
		shape r=new square();
		r.draw();
	}
}
