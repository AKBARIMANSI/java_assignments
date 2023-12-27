package file_io;

import java.io.File;
import java.io.IOException;

public class createfile
{
    public static void main(String[] args)
    {
		File f=new File("C:\\Users\\Dell\\Desktop\\LC.txt");
		try
		{
    	  if(f.createNewFile())
    	    {
    		    System.out.println("file succesfully creat..!");
    	    }
    	  else
    	    {
    	    	System.out.println("file Already exist...!");
    	    }
	    }
		catch(IOException i)
		{
			System.out.println("Exception handled..!");
		}
	}
}
