package com.duttech.zookeeper;

public class Bat extends Mammal{
	
	private int remainigEnergy;
	
	public Bat()
	{
		remainigEnergy = 300;
		
	}
	
	
	public void fly()
	{
		System.out.println("Bat is flying");
		remainigEnergy-=50;
	}
	
	public void eatHumans()
	{
		System.out.println("Bat is Eating");
		remainigEnergy+=25;
	}
	
	public void attackTown()
	{
		System.out.println("Attacking the Town");
		remainigEnergy-=100;
	}
	
	public void displayEnergy()
	{
		System.out.println("Remainig Energy for "+
				this.getClass().getSimpleName()+" is: "+
				remainigEnergy);
	}

}
