package tw.org.iii.Home;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Sample149 {
// 從檔案讀取大量的資料
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("test2.txt"));
			
			int[] test = new int[7];
			String str;
			
			for(int i=0; i<test.length; i++){
				str = br.readLine();
				test[i] = Integer.parseInt(str);
			}
			
			int max = test[0];
			int min = test[0];
			for(int i=0; i<test.length; i++){
				if(max < test[i])
					max = test[i];
				if(min > test[i])
					min = test[i];
				System.out.println(test[i]);
			}
			System.out.println("最高分是:" + max);
			System.out.println("最低分是:" + min);
			
			
			br.close();
		} catch (IOException e) {
			System.out.println("輸出入錯誤");
		}
	}

}
