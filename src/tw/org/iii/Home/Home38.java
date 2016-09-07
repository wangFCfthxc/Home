package tw.org.iii.Home;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Home38 {

	public static void main(String[] args) throws IOException {
		System.out.println("請輸入考試人數:");
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int num = Integer.parseInt(str);
		
//		int[] test;
//		test = new int[num];
		int[] test = new int [num];
		
		System.out.println("請輸入考試分數:");
		
		for(int i=0; i<num; i++){
			str = br.readLine();
			int tmp = Integer.parseInt(str);
			test[i] = tmp;			
		}
		for(int i=0; i<num;i++){
			System.out.println("第" + (i+1) + "個人的分數是" + test[i] + "分");
		}
	}

}
