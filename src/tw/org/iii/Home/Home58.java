package tw.org.iii.Home;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Home58 {

	public static void main(String[] args) throws IOException {
		System.out.println("請輸入字串");
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		StringBuffer str2 = new StringBuffer(str1);
		str2.reverse();
		System.out.println("把" + "「"+str1+"」" + "反過來寫就會變成" + "「"+str2+"」");
	}

}
