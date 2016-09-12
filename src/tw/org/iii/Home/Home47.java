package tw.org.iii.Home;

public class Home47 {

	public static void main(String[] args) {
		Car471 MyCar1 = new Car471();
		MyCar1.show();
		
		Car471 MyCar2 = new Car471(9866,65.2136);
		MyCar2.show();

	}
}

class Car471{
	// Field
	private int num;
	private double gas;
	// Constructor多載
	// Constructor 1:
	public Car471(){
		num = 0;
		gas = 0.0000;
		System.out.println("產生一部車子");
	}
	// Constructor 2:
	public Car471(int n, double g){
		num = n;
		gas = g;
		System.out.println("生產了車號為:" + num + "\n" + "汽油量為:" + gas + "的車子");
	}
	// Method
		public void show(){
			System.out.println("車號是:" + num);
			System.out.println("汽油量是:" + gas);
		}
}
