package tw.org.iii.Home.se8;

import static java.lang.System.out;

import java.util.Scanner;

public class Guest {

	public static void main(String[] args) {
		ArrayList names = new ArrayList();
		collectNameTo(names);
		out.println("訪客名單:");
		printUpperCase(names);

	}

	static void printUpperCase(ArrayList names) {
		for(int i=0; i < names.size(); i++){
			String name = (String) names.get(i);
			out.println(name.toUpperCase());
		}
	}

	static void collectNameTo(ArrayList names) {
		Scanner console = new Scanner(System.in);
		while (true) {
			out.print("訪客名單:");
			String name = console.nextLine();
			if (name.equals("quit")) {
				break;
			}
			names.add(name);
		}
	}

}
