import java.util.Scanner;

public class Main {

	 public static void main(String args[])
	 {
	 BankDetails b = new BankDetails("Onkar",123456789, 5000);
	 
	 System.out.println("Bank details are:");
	 System.out.println("*************************************");
	 System.out.println("Bank Name: Axis Bank Ltd");
	 System.out.println("IFSC: UTIB00123");
	 System.out.println("-------------------------------------");
	 System.out.println("Account Number:"+b.accNo);
	 System.out.println("Name:"+b.name);
	 System.out.println("Aadhar Id:"+b.aadharId);
	 System.out.println("Current Amount:"+b.amt);
	 System.out.println("*************************************");
	 System.out.println("Withdraw amount");
	 b.amtWithdraw(2000);
	 System.out.println("Closing balance:"+b.amt);
	 }
	 }
