package tw.org.iii.Home;

public class Home37 {

	public static void main(String[] args) {
		int[] test;
		test = new int[5];
		test[0] = 80;
		test[1] = 90;
		test[2] = 50;
		test[3] = 60;
		test[4] = 70;
//		test[5] = 100;	
		for(int i=0; i<test.length; i++){
			System.out.println("第" + (i+1) + "個人的分數是" + test[i] + "分");
		}

	}

}
