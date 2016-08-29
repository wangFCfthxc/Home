package tw.org.iii.Home;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;

public class Home19 {

	public static void main(String[] args) throws IOException{
		System.out.println("請輸入a或b");
		BufferedReader in =
				new BufferedReader(new InputStreamReader(System.in));
		String input = in.readLine();
		char dig = input.charAt(0);
		switch (dig) {
		case 'a':
			System.out.println("輸入的是a");
			break;
		case 'b':
			System.out.println("輸入的是b");
			break;
		default:
			System.out.println("請輸入a或b");
			break;
		}

	}

}
