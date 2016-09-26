package tw.org.iii.Home;

public class Home61 {

	public static void main(String[] args) {
		Car61 MyCars[] = new Car61[2];
		
		MyCars[0] = new Car61();
		MyCars[0].setCar(1234, 12.33);
		
		MyCars[1] = new RacingCar1();
		MyCars[1].setCar(4567, 15.12);
		
		for(int i=0; i<MyCars.length; i++){
			MyCars[i].show();
		}
	
		
	}

}
class Car61{
	protected int num1;
	protected double gas;
	
	public Car61(){
		num1 = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
	public void setCar(int n, double g){
		num1 = n;
		gas = g;
		System.out.println("將車號設為:" + num1 + "\n" + "汽油量設為:" + gas);
	}
	public void show(){
		System.out.println("車號是:" + num1 + "\n" + "汽油量是:" + gas);
	}
}

class RacingCar1 extends Car61{
	private int num2;
	public RacingCar1(){
		num2 = 0;
		System.out.println("生產了賽車");
	}
	public void setnum2(int c){
		num2 = c;
		System.out.println("將賽車編號設為" + num2);
	}
	public void show(){
		System.out.println("賽車的車號是:" + num1);
		System.out.println("汽油量是:" + gas);
		System.out.println("賽車編號是" + num2);
	}
}

