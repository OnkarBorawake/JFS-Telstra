package com.telstra.pack1;

public class Player {

	private Dice d1;
	private Dice d2;
	private int a,b;
	
	public Player() {
		super();
		d1 = new Dice();
		a = d1.roll();
		d2 = new Dice();
		b = d2.roll();
	}
	public int play() 
	{
	return(a + b);
	}

	
	public int getScoreD1()
	{
		return a;
	}
	public int getScoreD2()
	{
		return b;
	}
}