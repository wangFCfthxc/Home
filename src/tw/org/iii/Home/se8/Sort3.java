package tw.org.iii.Home.se8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort3 {
	public static void main(String[] args) {
		List accounts = Arrays.asList(
				new Account2("Panda", "X1234", 1000),
				new Account2("Haty", "X5678", 500),
				new Account2("Wisakops", "X2468", 2000));
		Collections.sort(accounts);
		System.out.println(accounts);

	}
}

class Account2 implements Comparable<Account2>{
	private String name;
	private String number;
	private int balance;

	Account2(String name, String number, int balance) {
		this.name = name;
		this.number = number;
		this.balance = balance;
	}

	@Override
	public String toString() {

		return String.format("Account2(%s, %s, %d", name, number, balance);
	}

	@Override
	public int compareTo(Account2 other) {
		return this.balance - other.balance;
	}

}
