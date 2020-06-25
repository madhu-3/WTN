package com.wipro.inheritance;

class Animal {
	public void eat()
	{
		System.out.println("Eat");
	}
	public void sleep()
	{
		System.out.println("Sleep");
		
	}
}
	 class Bird extends Animal
	{
		public void eat()
		{
			System.out.println("child Eat");
		}
		public void sleep()
		{
			System.out.println("child Sleep");
			
		}
		public void fly()
		{
			System.out.println("Fly");
			
		}
		
		
	}
	class Overriding{
	public static void main(String[] args) {
		Animal a=new Animal();
		a.eat();
		a.sleep();
		Bird b=new Bird();
		b.eat();
		b.sleep();
		b.fly();
		// TODO Auto-generated method stub

	}

}
