package com.wipro.arrays;

public class Ex3 {

	public static void main(String[] args) {
		int search=10,i,flag=0;
		if (args.length==0)
		{
			System.out.println("You didnot Enter any values");
		}
		else
		{
			for(i=0;i<args.length;i++)
			{
				if(search==Integer.parseInt(args[i]))
				{
					flag=1;
					System.out.println(i);
				}
				
			}
			if(flag==0)
				System.out.println(-1);
		}
			
		// TODO Auto-generated method stub

	}

}
