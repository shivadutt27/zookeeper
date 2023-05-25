package com.duttech.zookeeper;

public class Gorilla extends Mammal{

	private static int remainingEnergy;
	
	public Gorilla()
	{
		remainingEnergy = getEnergyLevel();
	}
	
	public void displayEnergy() 
	{
		System.out.println("Remainig Energy for "+
							this.getClass().getSimpleName()+" is: "+
							Gorilla.remainingEnergy);
	}
	
	public void throwThings()
	{
		System.out.println("Gorilla is throwing things");
		remainingEnergy-=5;
		//displayEnergy();
		
	}
	
	public void eatBanana()
	{
		System.out.println("Eating Banana");
		remainingEnergy+=10;
		//displayEnergy();
	}
	
	public void climb()
	{
		System.out.println("Gorilla is climbing \n");
		remainingEnergy-=10;
		//displayEnergy();
	}
}
