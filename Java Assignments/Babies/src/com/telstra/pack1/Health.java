package com.telstra.pack1;
import java.util.Random;
import java.util.Scanner;

public class Health {

	 double wt;
	 String str;
	 final int bid;
	 //int bid;

	 
		private static int key;
		
		static
		{
			key = 0;
		}
		private static int getKey()
		{
			return ++key;
		}
		public Health(String str, double wt) {
			super();
			this.wt = wt;
			this.str = str;
			this.bid = getKey();
		}
		
	 
	 public String putdata()
	 {
	if(wt>=2.5 && wt<=4.5)
	 {
		 return "Normal Weight. ---> Healthy";
	 }
	 else if(wt<2.5)
	 {
		 return "Under Weight. ---> Undernurished"; 
	 }
	 else
	 {
		 return "Over Weight. ---> Overnurished";
	 }

	 }
	 }
	 
