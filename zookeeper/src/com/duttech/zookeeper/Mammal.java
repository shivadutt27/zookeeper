package com.duttech.zookeeper;

public class Mammal {
	
	private int energyLevel;
	
	public Mammal()
	{
		this.energyLevel=100;
	}

	public int getEnergyLevel() {return this.energyLevel;}
	
	public void displayEnergy() {System.out.println("Remainig Energy for "+this.getClass().getSimpleName()+" is: "+this.getEnergyLevel());}
}
