package com.wipro.arrays;

public class Ex10 {

	public static void main(String[] args) {
		int l=args.length,i,max=0;
		if(l!=9)
			System.out.println("Please enter 9 integer numbers");
		else
		{
			System.out.println("The given array is:");
			for(i=0;i<9;i++)
			{
				if(max<Integer.parseInt(args[i]))
					max=Integer.parseInt(args[i]);
				if(i%3==0 && i!=0)
					System.out.println();
				System.out.print(args[i]+" ");
				
			}
			System.out.println();
			System.out.print("The biggest number in the given array is "+max);
		}
		// TODO Auto-generated method stub

	}
}

