package com.duttech.zookeeper;

public class BatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bat b1 = new Bat();
				
		b1.displayEnergy();
		
		int i=3;
		int j=2;
		int k=2;
		
		while(i>0)
		{
			b1.attackTown();
			i--;
		}
		
		while(j>0)
		{
			b1.eatHumans();
			j--;
		}
		
		while(k>0)
		{
			b1.fly();
			k--;
		}
		
		b1.displayEnergy();

	}

}
