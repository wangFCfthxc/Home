package tw.org.iii.Home.se8;

public class NineNineTable {

	public static void main(String[] args) {
		for (int j = 1; j < 9; j++) {
			for (int i = 2; i < 10; i++) {
				System.out.print(i + "*" + j + "=" + (i*j) + "\t");
//				System.out.printf("%d*%d=%2d ", i, j, i*j);
			}
			System.out.println();

		}
	}
}
