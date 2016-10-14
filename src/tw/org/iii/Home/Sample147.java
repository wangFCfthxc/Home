package tw.org.iii.Home;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Sample147 {
// 將資料輸出到檔案
	public static void main(String[] args) {
		try {
			PrintWriter pw = new PrintWriter(new BufferedWriter(
					new FileWriter("test1.txt")));
			
			pw.println("哈囉你好嗎?●↑");
			pw.println("Panda!");
			System.out.println("資料已經寫入檔案了");
			
			pw.close();
		} catch (IOException e) {
			System.out.println("輸出入錯誤");
		}
		
	}

}
