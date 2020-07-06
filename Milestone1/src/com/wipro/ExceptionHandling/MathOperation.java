package com.wipro.ExceptionHandling;

public class MathOperation{
	 static void calculate(int a[]) throws Exception{
		 int i,s=0,avg;
		 for(i=0;i<5;i++)
		 {
			 s=s+a[i];
		 }
		 avg=s/5;
		 System.out.println("Sum is "+s+"avg is "+avg);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int [] a=new int[5];
		for(i=0;i<args.length;i++)
		{
			a[i]=Integer.parseInt(args[i]);
		}
		try {
			calculate(a);
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}

}
