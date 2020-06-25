package com.wipro.flowcontrol;

public class Ex5 {

	public static void main(String[] args) {
		String a=args[0];
		char x=a.charAt(0);
		if((x>=65 && x<=90)||(x>=97&&x<=122))
			System.out.println("Alphabet");
		else if(x>=48 && x<=57)
			System.out.println("Digit");
		else if(x>=32&&x<=47)
			System.out.println("Special character");
		
			
		// TODO Auto-generated method stub

	}

}
