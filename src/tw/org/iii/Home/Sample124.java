package tw.org.iii.Home;

public class Sample124 {

	public static void main(String[] args) {
		Car124 MyCar = new Car124(1256, 42.36);
		MyCar.vShow();
		MyCar.mShow();

	}
}
// 交通工具介面
interface iVehicle124{
	void vShow();
}

// 材料介面
interface iMateral{
	void mShow();
}

// 車子類別124
class Car124 implements iVehicle124, iMateral{
	private int num;
	private double gas;
	
	public Car124(int n, double g){
		num = n;
		gas = g;
		System.out.println("生產了車號為" + num + ",汽油量為" + gas + "的車子");
	}
	
	public void vShow(){
		System.out.println("車號是:" + num);
		System.out.println("汽油量是:" + gas);
	}
	
	public void mShow(){
		System.out.println("車子的材料為白金");
		
	}
}
