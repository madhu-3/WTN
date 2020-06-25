package com.wipro.flowcontrol;

public class Ex3 {

	public static void main(String[] args) {
		int i;
		if(args.length==0)
		{
			System.out.println("N0 Values");
		}
		else
		{
			for(i=0;i<(args.length)-1;i++)
				System.out.print(args[i]+",");
			System.out.print(args[i]);
				
		}
		// TODO Auto-generated method stub

	}

}
