package tw.org.iii.Home;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Home05 {

	public static void main(String[] args) throws IOException{
		System.out.println("請輸入3個數字");
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		String str2 = br.readLine();
		String str3 = br.readLine();
		
		int num1 = Integer.parseInt(str1);
		double num2 = Double.parseDouble(str2);
		double num3 = Double.parseDouble(str3);
		 double num4 = (num2 + num3) ;
		
		System.out.println("第一個輸入:" + num1);
		System.out.println("第二個輸入:" + num2);
		System.out.println("第三個輸入:" + num4);

	}

}
