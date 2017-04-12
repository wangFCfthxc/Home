package tw.org.iii.Home.Math100;

import java.util.Scanner;

public class Math2_2 {

	public static void main(String[] args) {
		System.out.println("請輸入個人收入:");
		Scanner input = new Scanner(System.in); // 取的輸入物件
		double sr = input.nextDouble();
		System.out.println("應交個人所得稅:" + getTax(sr)); // 呼叫計算所得稅方法getTax

	}

	public static double getTax(double sal) {
		double t = 0; // t代表應交稅款
		double b = sal - 3500; // b代表應交稅所得額
		if (b <= 500) { // 計算級數1的稅款
			t = b * 0.05;
			return t;
		} else if (b <= 2000) { // 計算級數2的稅款
			t = 25 + (b - 500) * 0.1;
			return t;
		} else if (b <= 5000) { // 計算級數3的稅款
			t = 175 + (b - 2000) * 0.15;
			return t;
		} else if (b <= 20000) { // 計算級數4的稅款
			t = 625 + (b - 5000) * 0.2;
			return t;
		} else if (b <= 40000) { // 計算級數5的稅款
			t = 3625 + (b - 20000) * 0.25;
			return t;
		} else if (b <= 60000) { // 計算級數6的稅款
			t = 8625 + (b - 40000) * 0.3;
			return t;
		} else if (b <= 80000) { // 計算級數7的稅款
			t = 14625 + (b - 60000) * 0.35;
			return t;
		} else if (b <= 100000) { // 計算級數8的稅款
			t = 21625 + (b - 80000) * 0.4;
			return t;
		} else { // 計算級數9的稅款
			t = 29625 + (b - 100000) * 0.45;
			return t;
		}
	}
}
