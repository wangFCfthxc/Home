package tw.org.iii.Home.se8;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Standardin {

	public static void main(String[] args) throws IOException{
		System.setIn(new FileInputStream(args[0]));
		try (Scanner file = new Scanner(System.in)){
			while(file.hasNextLine()){
				System.out.println(file.nextLine());
			}
		}

	}

}
