package tw.org.iii.Home;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Home10 {

	public static void main(String[] args) throws IOException{
		System.out.println("請輸入三個整數");
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		String str3 = br.readLine();
		
		int sum = 10;
		sum %= Integer.parseInt(str1);
		sum %= Integer.parseInt(str2);
		sum %= Integer.parseInt(str3);
		
		System.out.println(sum);
		

	}

}
