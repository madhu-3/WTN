package com.wipro.arrays;

public class Ex8 {

	public static void main(String[] args) {
		int i,l,flag=0,s=0;
		l=args.length;
		for(i=0;i<l;i++)
		{
			s=s+Integer.parseInt(args[i]);
			if(Integer.parseInt(args[i])==6 && flag==0)
			{
				s-=6;
				while(Integer.parseInt(args[i])!=7)
				{
					i++;
				}
				
			}
			if(Integer.parseInt(args[i])==7)
				flag=1;
		}
		System.out.println(s);
		// TODO Auto-generated method stub

	}

}
