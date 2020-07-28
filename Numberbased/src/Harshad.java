import java.util.*;
//import java.lang.Math;
public class Harshad {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		int r,s=0,n;
		n=a;
		while(a>0)
		{
			r=a%10;
			s=s+r;
			a=a/10;
		}
		if(n%s==0)
			System.out.println("The given number is Harshad number");
		else
			System.out.println("The given number is not Harshad number");
		
		// TODO Auto-generated method stub

	}

}
