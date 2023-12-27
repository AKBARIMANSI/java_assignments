package file_io;

import java.io.File;

public class FileInfo 
{
    public static void main(String[] args)
    {
    	File f=new File("C:\\Users\\Dell\\Desktop\\LC.txt");
    	
    	if(f.exists())
    	{
    		System.out.println("file name: "+f.getName());
    		System.out.println("file location: "+f.getAbsoluteFile());
    		System.out.println("file Writable: "+f.canWrite());
    		System.out.println("file Readable: "+f.canRead());
    		System.out.println("file Size: "+f.length());
    	}
    	else
    	{
    		System.out.println("File doesn't Exists");
    	}
    	
	}
}
