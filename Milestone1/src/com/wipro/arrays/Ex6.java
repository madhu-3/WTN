package com.wipro.arrays;

public class Ex6 {

	public static void main(String[] args) {
		int i,j,l;
		String temp;
		l=args.length;
		for(i=0;i<l-1;i++)
		{
			for(j=0;j<l-i-1;j++)
			{
				if(Integer.parseInt(args[j])>Integer.parseInt(args[j+1]))
				{
					temp=args[j];
					args[j]=args[j+1];
					args[j+1]=temp;
					
				}
			}
		}
		for(i=0;i<l;i++)
			System.out.print(args[i]+" ");
		// TODO Auto-generated method stub

	}

}
