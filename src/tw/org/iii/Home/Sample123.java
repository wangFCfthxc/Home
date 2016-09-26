package tw.org.iii.Home;

public class Sample123 {

	public static void main(String[] args) {
		iVehicle[] ivc = new iVehicle[2];

		ivc[0] = new Car123(3265, 32.1);
		ivc[1] = new Plane123(119);

		for (int i = 0; i < ivc.length; i++) {
			ivc[i].show();
		}
	}
}

// 實作介面
// 交通工具介面
interface iVehicle {
	void show();
}

// 車子類別
class Car123 implements iVehicle {
	private int num;
	private double gas;

	public Car123(int n, double g) {
		num = n;
		gas = g;
		System.out.println("生產了車號為" + num + "\n" + "汽油量為" + gas + "的車子");
	}

	public void show() {
		System.out.println("車號是:" + num);
		System.out.println("汽油量是:" + gas);
	}
}

// 飛機類別
class Plane123 implements iVehicle {
	private int flight;

	public Plane123(int f) {
		flight = f;
		System.out.println("生產了" + flight + "班次的飛機");
	}

	public void show() {
		System.out.println("飛機的班次是:" + flight);
	}
}