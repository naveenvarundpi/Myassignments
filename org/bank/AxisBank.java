package org.bank;

public class AxisBank extends BankInfo{
	public String deposit()
	{
		return "Intrest rate for deposit is 8";
	}
	public static void main(String[] args) {
		AxisBank interestrate= new AxisBank();	
		System.out.println(interestrate.deposit());
		System.out.println(interestrate.saving());
		System.out.println(interestrate.fixed());
	}



}
