package tw.org.iii.Home;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Home07 {

	public static void main(String[] args) throws IOException{
		System.out.println("請輸入2個數字");
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		System.out.println("相*結果是:" + (num1*num2));
		

	}

}
