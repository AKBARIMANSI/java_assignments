package arrayprogtams;

import java.util.Scanner;

public class arrayof2d
{
     public static void main(String[] args)
     {
		int a[][]=new int [2][2];
		Scanner r=new Scanner(System.in);
		System.out.print("enetr array elements");
		for(int i=0; i<2; i++)
		{
			for(int j=0; j<2; j++)
			{
				a[i][j]=r.nextInt();
			}
		}
		System.out.print("matrix: \n");
		for(int i=0; i<2; i++)
		{
			for(int j=0; j<2; j++)
			{
				System.out.print(a[i][j]+ " ");
			}
			System.out.print("\n");
			
    	}
     }
     
}
