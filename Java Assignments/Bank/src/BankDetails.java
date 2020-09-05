import java.util.Random;
import java.util.Scanner;

public class BankDetails {
	 final long accNo;
	 //int bid;
	 String name;
	 long aadharId;
	 long amt, wda;
	 
		private static int key;
		
		static
		{
			key = 0;
		}
		private static int getKey()
		{
			//return ++key;
			Random ran = new Random();
			key = ran.nextInt(900000000)+100000000;
			return key;
		}
		public BankDetails(String name, long aadharId, long amt) {
			super();
			this.name = name;
			this.aadharId = aadharId;
			this.amt = amt;
			this.accNo = getKey();
		}
		
		 public String amtWithdraw(int wda)
		 {
			 if(wda>amt)
			 {
				 return "Withdrawl amount is greater than deposited amount";
			 }
			 else
			 {
				 amt -= wda;
				 return ("Amount withdrawn:"+wda);
			 }

		 }
}
