package com.telstra.pack1;

public class Stadium {

	public static void main(String[] args) {

		Player p1 = new Player();
		Player p2 = new Player();
		
		int p1Score = p1.play();
		int p2Score = p2.play();
		
		int die1 = p1.getScoreD1();
		int die2 = p1.getScoreD2();		
		int diec1 = p2.getScoreD1();
		int diec2 = p2.getScoreD2();
		System.out.println("Dice 1 value for P1:"+die1);
		System.out.println("Dice 2 value for P1:"+die2);
		System.out.println("Dice 1 value for P2:"+diec1);
		System.out.println("Dice 2 value for P2:"+diec2);
		System.out.println("Player 1 score:"+p1Score);
		System.out.println("Player 2 score:"+p2Score);
		
		if(p1Score>p2Score)
		{
			System.out.println("Player 1 won");
		}
		else if(p1Score<p2Score)
		{
			System.out.println("Player 2 won");
		}
		else
		{
			System.out.println("Draw!!!");
		}
	}

}
