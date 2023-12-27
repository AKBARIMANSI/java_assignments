package pettan;

public class P2 
{
   public static void main(String[] args)
   {
	    int lines=9;
	    int starCount=1;
		int spaceCount=lines-1;
		int mid=(lines/2)+1;
		for(int j=1; j<=lines; j++)
			
		{
	       for(int k=1; k<=spaceCount; k++)
			 {
				 System.out.print(" ");
			 }
			 
			 for(int i=1; i<=starCount; i++)
			 {
			    if(i==starCount ||i==1 || j==mid || j==lines)
				   {
			    	   System.out.print("*");
				   }
			    else
			    {
			    	 System.out.print(" ");
			    }
			    
			 }
			 System.out.println();
		     if(j<mid)
			 {
			 starCount = starCount+2;
		     spaceCount--;
			 }
		} 
	}
}
