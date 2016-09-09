package tw.org.iii.Home;

import sun.security.util.Length;

public class Hello43 {

	public static void main(String[] args) {
//		int[][] test = new int[2][2];
//		test = new int[2][2];
//		test[0][0] = 80;
//		test[0][1] = 60;
//		test[1][0] = 90;
//		test[1][1] = 100;
		
		int[][] test = {{80,60,22,50},{90,55,68,72},{33,75,63}};
		
		for(int i=0; i<test.length ; i++){
			System.out.println("第" + (i+1) + "個人的國語分數是:" + test[0][i] + "分");
			System.out.println("第" + (i+1) + "個人的數學分數是:" + test[1][i] + "分");
			System.out.println("第" + (i+1) + "個人的英文分數是:" + test[2][i] + "分");
		}
	}

}
