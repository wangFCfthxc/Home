package tw.org.iii.Home.Math100;

import java.util.Scanner;

public class Math1_5 {
	public static void main(String[] args) {
		System.out.print("請輸入行數：");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();					// 鍵盤接收行數
		
		int[][] ary = getTriangle(num);				// 得到巴斯卡三角形
		
		print(ary);									// 列印巴斯卡三角形
	}

	private static void print(int[][] ary) {
		for(int i=0; i<ary.length; i++){				// 外迴圈控制行
			for(int j=0; j<=i; j++){					// 內迴圈控制列
				System.out.printf(" %-3d", ary[i][j]);
			}
			System.out.println();
		}
		
	}

	private static int[][] getTriangle(int num) {
		int[][] ary = new int[num][num];			// 用二維陣列儲存
		for(int i=0; i < ary.length; i++){			// 直邊.斜邊設定為1
			ary[i][0] = 1;
			ary[i][i] = 1;
		}
		for(int i=1; i < ary.length; i++){			// 外迴圈控制行數
			for(int j=1; j <= i; j++){				// 內迴圈控制列
				// 裡面值，等於目前位置的上方和左上角之和
				ary[i][j] = ary[i-1][j-1] + ary[i-1][j];
			}
		}
		return ary;
	}

}
