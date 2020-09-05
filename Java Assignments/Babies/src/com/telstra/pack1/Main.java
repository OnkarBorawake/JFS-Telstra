package com.telstra.pack1;

import java.util.Scanner;

public class Main {

	 public static void main(String args[])
	 {
	 Health h = new Health("Om",3.5);
	

	 System.out.println("Baby details are:");
	 System.out.println("---------------------------------");
	 System.out.println("Baby_id:"+h.bid);
	 System.out.println("Name:"+h.str);
	 System.out.println("Weight:"+h.wt);
	 System.out.println("Report:");
	 System.out.println(h.putdata());
	 System.out.println("---------------------------------");
	 }
	 
	 }

