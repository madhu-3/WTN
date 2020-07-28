import java.util.*;
import java.lang.Math;
public class Disarium {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		int temp,c=0,s=0,temp1,r;
		temp=a;
		temp1=a;
		while(temp>0)
		{
			c++;
			temp=temp/10;
		}
		while(temp1>0)
		{
			r=temp1%10;
			s=s+(int)Math.pow(r,c);
			temp1=temp1/10;
			c--;
		}
		if(s==a)
			System.out.println("The given number is Disarium number");
		else
			System.out.println("The given number is not Disarium number");
		
		// TODO Auto-generated method stub

	}

}
