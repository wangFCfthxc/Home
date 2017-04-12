package tw.org.iii.Home.se8;

import static java.lang.System.out;


import java.util.Scanner;
import java.util.*;
import java.util.ArrayList;

public class Guest {

	public static void main(String[] args) {
		List names =  new LinkedList();
		collectNameTo(names);
		out.println("訪客名單:");
		printUpperCase(names);

	}

	static void printUpperCase(List names) {
		for(int i=0; i < names.size(); i++){
			String name = (String) names.get(i);
			out.println(name.toUpperCase());
		}
	}

	static void collectNameTo(List names) {
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
