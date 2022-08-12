package com.tns.springioc;

public class Airtel implements Sim {
	public Airtel()
	{
		System.out.println("Airtel constructor is called");	
	}

	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("calling using airtel sim");
	}

	public void data() {
		// TODO Auto-generated method stub
		System.out.println("Browsing using airtel sim");
	}

}
