package tw.org.iii.Home.se8;

public class Score {

	public static void main(String[] args) {
		int[] scores = { 88, 81, 74, 68, 7, 76, 77, 85, 95, 93 };
		// for (int i = 0; i < scores.length; i++) {
		// System.out.printf("學生分數：%d %n", scores[i]);
		// }

		scores[3] = 100;

		// Enhanced for loop
		for (int score : scores) {
			System.out.printf("學生分數：%d %n", score);
		}

	}

}
