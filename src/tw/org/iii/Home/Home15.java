package tw.org.iii.Home;

import java.io.*;
import java.io.InputStreamReader;
import java.nio.Buffer;

import jdk.internal.util.xml.impl.Input;

public class Home15 {

	public static void main(String[] args) throws IOException {
		System.out.println("請輸入科目1~5的分數:");
		BufferedReader in =
				new BufferedReader(new InputStreamReader(System.in));
		
	      String str1 = in.readLine();
	      String str2 = in.readLine();
	      String str3 = in.readLine();
	      String str4 = in.readLine();
	      String str5 = in.readLine();
	      
	      int total = 0;
	      total += Integer.parseInt(str1);
	      total += Integer.parseInt(str2);
	      total += Integer.parseInt(str3);
	      total += Integer.parseInt(str4);
	      total += Integer.parseInt(str5);
	      
	      
	      System.out.println("5個科目的總分為:" + total);
	      System.out.println("5個科目的平均為:" + (total/(double)5));

	}

}
