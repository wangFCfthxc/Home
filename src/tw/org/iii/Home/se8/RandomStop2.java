package tw.org.iii.Home.se8;

public class RandomStop2 {

	public static void main(String[] args) {
		int number;
		do{
			number = (int)(Math.random()*10);
			System.out.println(number);
		}while(number !=7);
		System.out.println("Lucky 7!");

	}

}
