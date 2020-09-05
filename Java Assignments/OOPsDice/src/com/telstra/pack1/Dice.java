package com.telstra.pack1;
import java.util.Random;

public class Dice {

	public int roll()
	{
		Random ran = new Random();
		return (ran.nextInt(5)+1);
	}
}
