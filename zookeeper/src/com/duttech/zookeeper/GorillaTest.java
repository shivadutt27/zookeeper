package com.duttech.zookeeper;

public class GorillaTest {

	public static void main(String[] args) {
		
		//Mammal m1 = new Mammal();

		Gorilla g1 = new Gorilla();
		int i=3;
		int j=2;
		while(i>0)
		{
			g1.throwThings();
			i--;
		}
		
		while(j>0)
		{
			g1.eatBanana();
			j--;
		}
		
		g1.climb();
		
		g1.displayEnergy();
				

	}

}
