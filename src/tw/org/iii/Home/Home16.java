package tw.org.iii.Home;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Home16 {

	public static void main(String[] args) throws IOException{
		System.out.println("請輸入整數");
		BufferedReader in =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = in.readLine();
		int str1 = Integer.parseInt(str);
		
		if (str1 == 1)
			System.out.println("輸入結果是:" + str1);
		System.out.println("結束處理");

	}

}
