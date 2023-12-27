package statements;

public class Fibbonacci 
{
	public static void main(String[] args)
	{
		
		int num=15;
		int a=0;
		int b=1;
		int c;
		
		System.out.print(a+" "+b+" ");
         for(int i=3;i<=num;i++)
         {
        	 c=a+b;
        	 System.out.print(c+" ");
        	 a = b;
        	 b = c;
         }
	}

}
