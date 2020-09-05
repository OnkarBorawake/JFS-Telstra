package com.telstra.pack1;

public class Main {

	public static void main(String[] args) {
		State s1 = new State();
		String str[]={"Maharashtra","Goa"};
		System.out.println("Places to visit in this states are:");
		System.out.println(s1.getData(str));
	}

}
