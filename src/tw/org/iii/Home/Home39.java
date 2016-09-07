package tw.org.iii.Home;

public class Home39 {

	public static void main(String[] args) {
		int[] test = new int[5];
		// for(int element : test) {
		// System.out.print(element);
		// }
		test[0] = 80;
		test[1] = 90;
		test[2] = 70;
		test[3] = 60;
		test[4] = 40;
		// for(int element : test) {
		// System.out.println(element);
		// }
		for (int i = 0; i < test.length; i++) {

			System.out.println("第" + (i + 1) + "個人的分數是:" + test[i] + "分");
		}
	}

}
