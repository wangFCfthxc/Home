package tw.org.iii.Home;

public class Home48 {

	public static void main(String[] args) {
		Car48 MyCar1 = new Car48();
		MyCar1.show();
		Car48 MyCar2 = new Car48(4768,32.0000);
		MyCar2.show();

	}
}

class Car48{
	// Field
	private int num;
	private double gas;
	// Constructor呼叫
	// Constructor1
	public Car48(){
		num = 0;
		gas = 0.0000;
		System.out.println("產生一部車子");
	}
	// Constructor2.呼叫Constructor1
	public Car48(int n, double g){
		this();
		num = n;
		gas = g;
		System.out.println("將車號設為:" + num + "\n" + "汽油量設為:" + gas);
	}
	// Method
		public void show(){
			System.out.println("車號是:" + num);
			System.out.println("汽油量是:" + gas);
		}
}
