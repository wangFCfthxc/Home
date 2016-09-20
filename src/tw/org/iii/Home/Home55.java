package tw.org.iii.Home;

public class Home55 {
// 指定資料給類別型態的變數
	public static void main(String[] args) {
		Car55 MyCar = new Car55();
		System.out.println("MyCar");
		MyCar.setCar(7854, 56.2);
		
		Car55 UrCar;
		System.out.println("UrCar");
		
		UrCar = MyCar;
//		MyCar = null;
		System.out.println("將MyCar指定給UrCar");
		
		System.out.println("MyCar的");
		MyCar.show();
		System.out.println("UrCar的");
		UrCar.show();
		
		// MyCar和UrCar其實是指到同一個Car55物件
		System.out.println("改變MyCar的資料");
		MyCar.setCar(5648, 20.654);
		
		System.out.println("MyCar的");
		MyCar.show();
		System.out.println("UrCar的"); // UrCar的資料跟著改變
		UrCar.show();
		
		
	}
}

class Car55{
	// Field
	private int num;
	private double gas;
	// Constructor
	public Car55(){
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
	// Method
	public void setCar(int n, double g){
		num = n;
		gas = g;
		System.out.println("將車牌設為:" + num + "\n" +"汽油量設為:" + gas);
	}
	public void show(){
		System.out.println("車牌是:" + num);
		System.out.println("汽油量是:" + gas);
	}
	
}