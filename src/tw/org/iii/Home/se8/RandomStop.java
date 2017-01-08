package tw.org.iii.Home.se8;

public class RandomStop {

	public static void main(String[] args) {
		while(true){
			int number = (int)(Math.random()*10);
			System.out.println(number);
			if(number == 7){
				System.out.println("Lcky 7!");
				break;
			}
		}

	}

}
