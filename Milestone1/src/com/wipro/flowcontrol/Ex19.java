package com.wipro.flowcontrol;

public class Ex19 {

	public static void main(String[] args) {
		int i=5,c=0;
		while(c!=5)
		{
			if(i%5==0 && i%2==0 &&i%3==0)
			{
				System.out.println(i);
				c++;
			}
			i++;
			
		}
		// TODO Auto-generated method stub

	}

}
