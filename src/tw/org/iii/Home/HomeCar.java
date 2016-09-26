package tw.org.iii.Home;

public class HomeCar {

	public static void main(String[] args) {		
	Car MyCar = new Car();
	MyCar.setCar(1234, 52.3);
	MyCar.show();
	}
}

class Car{
	// Field
	protected int num;
	protected double gas;
	// Constructor	
	public Car(){
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
	// Method
	public void setCar(int n, double g){
		num = n;
		gas = g;
		System.out.println("將車號設:" + num);
		System.out.println("將油量設為:" + gas);
	}
	public String toString(){
		String str = "車號:" + num + ";汽油量:" + gas + "的車子";
		return str;
	}
	public void show(){
		System.out.println("車號是:" + this.num);
		System.out.println("汽油量是:" + this.gas);
	}
	void showCar(){
		System.out.println("開始顯示車子的資料");
		this.show();
	}
}
