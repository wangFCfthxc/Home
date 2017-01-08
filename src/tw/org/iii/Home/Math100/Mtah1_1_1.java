package tw.org.iii.Home.Math100;

import java.util.Scanner;

public class Mtah1_1_1 {
// 倒金字塔
	public static void main(String[] args) {
		int i, j, k, n;
		Scanner input = new Scanner(System.in);
		System.out.print("請輸入金字塔層數:");
		n = input.nextInt();
		// 外層迴圈控制層數
		for (i = n; i >= 0; i--) {
			for(j=0;j<n-i;j++)
            {
               System.out.print(" ");
             }
           for(k=1;k<=i*2-1;k++)
             {
               System.out.print("*");
             }
           System.out.println("");
			
		}
	}
}
