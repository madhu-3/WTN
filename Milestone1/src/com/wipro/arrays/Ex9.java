package com.wipro.arrays;

public class Ex9 {

	public static void main(String[] args) {
		int l=args.length,i;
		if(l!=4)
			System.out.println("Please enter 4 integer numbers");
		else
		{
			System.out.println("The given array is:");
			for(i=0;i<4;i++)
			{
				if(i==2)
					System.out.println();
				System.out.print(args[i]+" ");
				
			}
			System.out.println();
			System.out.println("The reverse of array is:");
			for(i=3;i>=0;i--)
			{
				if(i==1)
					System.out.println();
				System.out.print(args[i]+" ");
				
			}
			
		}
		// TODO Auto-generated method stub

	}

}
