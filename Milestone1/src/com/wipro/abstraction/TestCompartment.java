package com.wipro.abstraction;
import java.util.*;
abstract class Compartment{
	public abstract String notice();
}
class FirstClass extends Compartment
{
	public String notice()
	{
		return "Welcome to Firstclass reservation compartment";
	}
}
class Ladies extends Compartment
{
	public String notice()
	{
		return "Welcome to Ladies reservation compartment";
	}
}
class General extends Compartment
{
	public String notice()
	{
		return "Welcome to General unreserved compartment";
	}
}
class Luggage extends Compartment
{
	public String notice()
	{
		return "Welcome to Luggage compartment";
	}
}
public class TestCompartment {

	public static void main(String[] args) {
		Compartment[] com=new Compartment[10];
		Random random=new Random();
		for(int i=0;i<10;i++)
		{
			int rand=random.nextInt(4)+1;
			System.out.print(rand);
			switch(rand) {
			case 1:com[i]=new FirstClass();
			       System.out.println(com[i].notice());
			       break;
			case 2:com[i]=new Ladies();
		           System.out.println(com[i].notice());
		           break;
			case 3:com[i]=new General();
	               System.out.println(com[i].notice());
	               break;
			case 4:com[i]=new Luggage();
	               System.out.println(com[i].notice());
	               break;
			}
		}
		// TODO Auto-generated method stub

	}

}
