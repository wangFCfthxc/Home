package tw.org.iii.Home;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Home43 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] test = new int[5];
		System.out.println("請輸入" + test.length + "個人的分數:");

		for (int i = 0; i < test.length; i++) {
			String str = br.readLine();
			test[i] = Integer.parseInt(str);
			// System.out.println(test[i]);
		}
		for (int s = 0; s < test.length - 1; s++) {
			for (int t = s + 1; t < test.length; t++) {
				if (test[t] > test[s]) {
					int tmp = test[t];
					test[t] = test[s];
					test[s] = tmp;
				}
			}
		}
		for(int j=0; j<test.length; j++){
			System.out.println("第" + (j+1) + "個人的分數是" + test[j] + "分");
		}
		System.out.println("最高分是" + test[0] + "分");

	}

}
