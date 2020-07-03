package com.wipro.abstraction;

abstract class Instrument{
	abstract void  Play();
}

class Piano extends Instrument{
	 void Play()
	{
		System.out.println("Piano is playing tan tan tan tan");
	}
}
class Flute extends Instrument{
	 void Play()
	{
		System.out.println("Flute is playing toot toot toot toot");
	}
}
class Guitar extends Instrument{
	 void Play()
	{
		System.out.println("Guitar is playing tin tin tin tin");
	}
}
public class AbstractTest {

	public static void main(String[] args) {
		Instrument []inst=new Instrument[10];
		for(int i=0;i<10;i++)
		{
			if(i%2==0 && i<=4) {
			inst[i]=new Piano();
			inst[i].Play();
			}
			else if (i%2==1) {
				inst[i]=new Flute();
				inst[i].Play();
				
			}
			else
			{
				inst[i]=new Guitar();
				inst[i].Play();
			}
		}
		for(int i=0;i<10;i++)
		{
			if(inst[i] instanceof Piano)
			{
				System.out.println("Piano object at i:"+i);
			}
			else if(inst[i] instanceof Flute)
			{
				System.out.println("Flute object at i:"+i);
				
			}
			else
			{
				System.out.println("Guitar object at i:"+i);
			}
			
		}
		
		
		// TODO Auto-generated method stub

	}

}
