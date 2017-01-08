package tw.org.iii.Home.Math100;

import java.util.Scanner;

public class Mtah1_1 {
// 正金字塔
	public static void main(String[] args) {
		int i, j, k, n;
		Scanner input = new Scanner(System.in);
		System.out.print("請輸入金字塔層數:");
		n = input.nextInt();
		// 外層迴圈控制層數
		for (i = 1; i <= n; i++) {
			// 根據外層行數，輸出星號左邊空格
			for (j = 1; j <= n-i; j++)
				System.out.print(" ");
			// 根據外層行數，輸出星號個數
			for (k = 1; k <= 2*i-1; k++)
				System.out.print("*");
			// 一行結束，換行
			System.out.println("");
		}
	}
}
