package tw.org.iii.Home.se8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class WordCount {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		System.out.println("請輸入英文:");
		Set words = tokenSet(console.nextLine());
		System.out.printf("不重複單字有 %d 個:%s%n", words.size(),words);

	}

	static Set tokenSet(String Line) {
		String[] tokens = Line.split(" ");
		return new HashSet(Arrays.asList(tokens));
	}

}
