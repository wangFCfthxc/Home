package tw.org.iii.Home;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Exercise142 {

	public static void main(String[] args) {
		try {
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("test1.txt")));
			
			pw.println("A long time ago,");
			pw.println("There was a little girl.");
			
			pw.close();
		} catch (IOException e) {
			System.out.println("輸出入錯誤");
		}
	}

}
