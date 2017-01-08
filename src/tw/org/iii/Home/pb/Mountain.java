package tw.org.iii.Home.pb;

import java.util.Arrays;

public class Mountain extends Rock {
	Mountain() {
		super("granite ");
		new Rock("granite ");
	}

	public static void main(String[] a) {
		new Mountain();
	}
}

class Atom {
	Atom() {
		System.out.print("atom ");
	}
}

class Rock extends Atom {
	Rock(String type) {
		System.out.print(type);
	}
}