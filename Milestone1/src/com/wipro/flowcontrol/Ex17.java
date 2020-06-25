package com.wipro.flowcontrol;

public class Ex17 {

	public static void main(String[] args) {
			int a=Integer.parseInt(args[0]);
			int r;
			while(a>0)
			{
				r=a%10;
				System.out.print(r);
				a=a/10;
			}
		// TODO Auto-generated method stub

	}

}
