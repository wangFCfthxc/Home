package tw.org.iii.Home;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Home30 {
// break
	public static void main(String[] args) throws IOException {
		System.out.println("請問要在第幾次處理結束迴圈?");
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int res = Integer.parseInt(str);
		
		for(int i=1; i<=20; i++){
			System.out.println("第" + i +"次的處理");
			if (i == res)
				break;
		}
	}

}
