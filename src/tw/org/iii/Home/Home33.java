package tw.org.iii.Home;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Home33 {

	public static void main(String[] args) throws IOException {
		System.out.println("請輸入考試的成績(輸入0就結束)");
		BufferedReader br=
				new BufferedReader(new InputStreamReader(System.in));
		int num = 0;
		int sum = 0;
		
		do{
			String str = br.readLine();
			num = Integer.parseInt(str);
			sum += num;
		}while (num != 0);
		System.out.println("總分為" + sum + "分");
	}

}
