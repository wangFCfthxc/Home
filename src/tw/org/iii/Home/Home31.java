package tw.org.iii.Home;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Home31 {
// continue
	public static void main(String[] args) throws IOException {
		System.out.println("要跳過第幾次的處理?");
		
		BufferedReader Input =
				new BufferedReader(new InputStreamReader(System.in));
		String str = Input.readLine();
		int In = Integer.parseInt(str);
		
		for(int i=1; i<=10; i++){
			if (i == In)
				continue;
			System.out.println("第" + i + "次處理");
				}
	}

}
