package com.wipro.polymorphism;
class Fruit{
	String name;
	String taste;
	int size;
	public void eat()
	{
		System.out.print("Base class");
	}
}
class Apple extends Fruit{
	Apple(String name,String taste)
	{
		this.name=name;
		this.taste=taste;
	}
	public void eat()
	{
		System.out.println("Fruit:"+name);
		System.out.println("Taste:"+taste);
	}
	
}
class Orange extends Fruit{
	Orange(String name,String taste)
	{
		this.name=name;
		this.taste=taste;
	}
	public void eat()
	{
		System.out.println("Fruit:"+name);
		System.out.println("Taste:"+taste);
	}
	
}

public class overriding1 {

	public static void main(String[] args) {
		Fruit a=new Apple("Apple","Sweet");
		a.eat();
		Fruit o=new Orange("Orange","sour");
		o.eat();
		
		// TODO Auto-generated method stub
	}

}
