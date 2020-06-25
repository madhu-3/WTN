package com.wipro.flowcontrol;

public class Ex8 {

	public static void main(String[] args) {
		String a=args[0];
		char x=a.charAt(0);
		if(x=='R')
			System.out.println("Red");
		else if(x=='B')
			System.out.println("Blue");
		else if(x=='G')
			System.out.println("Green");
		else if(x=='O')
			System.out.println("Orange");
		else if(x=='Y')
			System.out.println("Yellow");
		else if(x=='W')
			System.out.println("White");
		else
			System.out.println("Invalid Code");
			
		
		// TODO Auto-generated method stub

	}

}
