package tw.org.iii.Home.se8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort2 {
	public static void main(String[] args) {
		List accounts = Arrays.asList(
				new Account("Panda", "X1234", 1000),
				new Account("Haty", "X5678", 500),
				new Account("Wisakops", "X2468", 2000));
		Collections.sort(accounts);
		System.out.println(accounts);

	}
}

class Account {
	private String name;
	private String number;
	private int balance;

	Account(String name, String number, int balance) {
		this.name = name;
		this.number = number;
		this.balance = balance;
	}

	@Override
	public String toString() {

		return String.format("Account(%s, %s, %d", name, number, balance);
	}

}
