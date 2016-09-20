package tw.org.iii.Home;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Home54 {

	public static void main(String[] args) throws IOException {
		System.out.println("請輸入兩個整數");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str1 = br.readLine();
		String str2 = br.readLine();
		
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
	
		// 比較兩個int型態的引數何者較大
		int ans1 = Math.max(num1, num2);
		int ans2 = Math.min(num1, num2);
		System.out.println(num1 + "與" + num2 + "中較大的是" + ans1);
		System.out.println(num1 + "與" + num2 + "中較小的是" + ans2);
	}
}
