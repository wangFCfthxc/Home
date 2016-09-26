package tw.org.iii.Home;

public class Home63 {

	public static void main(String[] args) {
		Car Car1 = new Car();
		Car Car2 = new Car();
		
		Car Car3;
		Car3 = Car1;
		
		boolean b11 = Car1.equals(Car2);
		boolean b12 = Car1.equals(Car3);
		
		System.out.println("Car1與Car2是相同結果為" + "\n" + b11);
		System.out.println("Car1與Car3是相同結果為" + "\n" + b12);
	}

}
