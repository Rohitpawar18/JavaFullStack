package com.bank;

public class TestAccount {
	public static void main(String[] args) {
		Accounts ac = new Accounts(5000);
		System.out.println(ac);
		
		try {
			ac.withdraw(50000);
		} catch (BalanceException e) {
//			e.printStackTrace();	// Used By Developers --> Troubleshooting
//			System.out.println(e);	// For Logging Purpose --> Audit System Behaviour
			System.out.println(e.getMessage());		// For End User
		}
		
//		ac.withdraw(3000);
//		System.out.println(ac);
//		ac.withdraw(7000);
//		System.out.println(ac);
//		
//		ac.deposit(2000);
//		System.out.println(ac);
//		ac.deposit(5000);
//		System.out.println(ac);
	}
}
