package com.wipro.arrays;

public class Ex7 {

	public static void main(String[] args) {
		int i,j,l;
		l=args.length;
		for(i=0;i<l;i++)
		{
			for(j=i+1;j<l;j++)
			{
				if(Integer.parseInt(args[i])==Integer.parseInt(args[j]))
				{
					args[j]="-1";
					
				}
			}
		}
		for(i=0;i<l;i++)
		{
			if(args[i]!="-1")
			{
			System.out.print(args[i]+" ");
			}
		}
		// TODO Auto-generated method stub

	}

}
