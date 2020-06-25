package com.wipro.flowcontrol;

public class Ex16 {

	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		if(args.length==0)
			System.out.println("Please enter input");
		else
		{
			int i,j;
			for(i=0;i<a;i++)
			{
				for(j=0;j<=i;j++)
				{
					System.out.print('*');
				}
				System.out.println();
			}
		}
		// TODO Auto-generated method stub

	}

}
