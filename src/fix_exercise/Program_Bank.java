package fix_exercise;

import java.util.Locale;
import java.util.Scanner;

import entitiy.Account;

public class Program_Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		Account account = new Account();
		
		System.out.print("Enter account number: ");
		int numberAccount = sc.nextInt();sc.nextLine();
		System.out.print("Enter account holder: ");
		String holderAccount = sc.nextLine();//sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		String resp = sc.nextLine();//sc.nextLine();
		double value = 0.00;
		switch (resp) {
		case "y":
			System.out.print("Enter initial deposit value: ");
			value = sc.nextDouble();
			account = new Account (numberAccount,holderAccount,value);
			break;
		case "n":
			account = new Account (numberAccount,holderAccount);
			break;
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(account);
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		double amount = sc.nextDouble();
		account.deposit(amount);
		System.out.println("Updated account data: ");
		System.out.println(account);
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		account.withdraw(withdraw);
		System.out.println("Updated account data: ");
		System.out.println(account);
				
		sc.close();

	}

}
