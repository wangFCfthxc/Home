package tw.org.iii.Home;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// 接受從鍵盤輸入的值
public class Home04 {

	public static void main(String[] args) throws IOException{
		System.out.println("請輸入字串");
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine(); // 將使用者從鍵盤輸入的字串指定給字串變數str
		// 利用str來代表輸入的字串
		System.out.println("剛才輸入的字串是:" + str);
	}

}
