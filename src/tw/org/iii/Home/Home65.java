package tw.org.iii.Home;

public class Home65 {

	public static void main(String[] args) {
		Vehicle[] vc = new Vehicle[2];
		vc[0] = new Carv2(1253, 45.33);
		vc[0].setSpeed(100);
		
		vc[1] = new Plane(911);
		vc[1].setSpeed(400);
		
		for(int i=0; i<vc.length; i++){
			vc[i].show();
		}
		
	}

}
// 交通工具類別
abstract class Vehicle{
	protected int speed;
	public void setSpeed(int s){
		speed = s;
		System.out.println("將速度設為" + speed);
	}
	
	abstract void show();
}
// 車子類別
class Carv2 extends Vehicle{
	protected int num;
	protected double gas;
	
	public Carv2(int n, double g){
		num = n;
		gas = g;
		System.out.println("生產了車號為" + num + "\n" + "汽油量為" + gas + "的車子");
	}
	public void show(){
		System.out.println("車號是:" + num);
		System.out.println("汽油量是:" + gas);
		System.out.println("速度是:" + speed);
	}
}
// 飛機類別
class Plane extends Vehicle{
	private int flight;
	
	public Plane(int f){
		flight = f;
		System.out.println("生產了" + flight + "班次的飛機");
	}
	public void show(){
		System.out.println("飛機的班次是:" + flight);
		System.out.println("速度是:" + speed);
	}
}
