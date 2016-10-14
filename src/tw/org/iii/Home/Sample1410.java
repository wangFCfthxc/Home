package tw.org.iii.Home;

import java.io.BufferedReader;
import java.io.FileReader;

public class Sample1410 {

	public static void main(String[] args) {
		if(args.length != 1){
			System.out.println("test4.txt");	// 檢查使用者輸入的字串數量
			System.exit(1);
		}
		try {
			BufferedReader br = new BufferedReader(new FileReader(args[0]));
			
			String str;
			while((str = br.readLine()) != null){
				System.out.println(str);
			}
			br.close();
		} catch (Exception e) {
			System.out.println("輸出入錯誤");
		}	
	}

}
