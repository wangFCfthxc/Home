package tw.org.iii.Home.se8;

public class Comparison {

	public static void main(String[] args) {
		int number = 75;
		System.out.printf("10 >  5 結果 %b%n", 10 > 5);
		System.out.printf("10 >= 5 結果 %b%n", 10 >= 5);
		System.out.printf("10 <  5 結果 %b%n", 10 < 5);
		System.out.printf("10 <= 5 結果 %b%n", 10 <= 5);
		System.out.printf("10 == 5 結果 %b%n", 10 == 5);
		System.out.printf("10 != 5 結果 %b%n", 10 != 5);
		System.out.println(number > 70 && number < 80);
		System.out.println(number > 80 || number < 75);
		System.out.println(!(number > 80 || number < 75));

	}

}
