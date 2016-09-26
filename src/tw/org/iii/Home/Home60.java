package tw.org.iii.Home;

public class Home60 {

	public static void main(String[] args) {
		CarPlus MyCar = new CarPlus(1234, 20.5, 5);
		
	}
}

class Car60{
	private int num1;
	private double gas;
	
	public Car60(){
		num1 = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
	public Car60(int n, double g) {
		num1 = n;
		gas = g;
		System.out.println("生產了車號為" + num1 + "汽油量為" + gas + "的車子");
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
// extends Car60
class CarPlus extends Car60{
	private int num2;
	
	public CarPlus(){
		num2 = 0;
		System.out.println("生產了賽車");		
	}
	public CarPlus(int n , double g, int c){
		super(n, g);
		num2 = c;
		System.out.println("生產了編號為" + num2 + "的賽車");
	}
	public void setnum2(int c){
		num2 = c;
		System.out.println("將賽車編號設為:" + num2);
	}
}
