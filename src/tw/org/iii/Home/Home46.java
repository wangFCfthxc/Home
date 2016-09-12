package tw.org.iii.Home;

public class Home46 {

	public static void main(String[] args) {
		CarV3 MyCar = new CarV3();
		MyCar.show();

	}
}

class CarV3{
	// Field
	private int num;
	private double gas;
	// Constructor
	public CarV3(){
		num = 0;
		gas = 0.00;
		System.out.println("產生一部車子");
	}
	// Method
	public void show(){
		System.out.println("車號是:" + num);
		System.out.println("汽油量是:" + gas);
	}
}

