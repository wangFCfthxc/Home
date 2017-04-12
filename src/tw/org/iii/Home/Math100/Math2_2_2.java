package tw.org.iii.Home.Math100;

import java.util.Scanner;

public class Math2_2_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int s = 0;
		int sum = 0;
		int salary[] = { 0, 500, 2000, 5000, 20000, 40000, 60000, 80000, 100000 }; // salary儲存分級標準
		int rate[] = { 5, 10, 15, 20, 25, 30, 35, 40, 45 }; // rate儲存分級稅率

		System.out.println("請輸入月收入:");
		s = input.nextInt();
		s = s - 3500; // 扣除基數

		int index = 0; // 級數
		// 迴圈尋找哪一級，index紀錄索引
		for (int i = 0; i < salary.length; i++) {
			if (s < salary[i]) {
				index = i;
				break;
			}
		}
		System.out.println("等級:" + index);

		// 迴圈計算扣除累計數
		for (int i = 0; i < index - 1; i++) {
			sum = sum + (int) ((salary[i + 1] - salary[i]) * rate[i] * 0.01);
		}

		// 最後稅款
		sum = sum + (int) ((s - salary[index - 1]) * rate[index - 1] * 0.01);
		System.out.println("稅款:" + sum);

	}

}
