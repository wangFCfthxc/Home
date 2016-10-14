package tw.org.iii.Home;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample146 {
	// 有對readLine()例外處理
	public static void main(String[] args) {
		System.out.println("請輸入字串");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// System.in...標準輸入
		try {
			String str = br.readLine();
			System.out.println("輸入字串:" + str);	// System.out...標準輸出
		} catch (IOException e) {
			System.out.println("輸入輸出有誤");
		}
	}

}
