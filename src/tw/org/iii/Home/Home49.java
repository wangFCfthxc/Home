package tw.org.iii.Home;

public class Home49 {

	public static void main(String[] args) {
		Car49.showSum();// 呼叫類別方法
		
		Car49 MyCar1 = new Car49();
		MyCar1.setCar49(8888, 88.988);		
		Car49.showSum();// 再次呼叫類別方法
		
		Car49 MyCar2 = new Car49();
		MyCar1.setCar49(7689, 99.12);
		Car49.showSum();
		
	}
}

class Car49{
	// Field
	public static int sum = 0; // 類別變數
	private int num;
	private double gas;
	// Constructor
	public Car49(){
		num = 0;
		gas = 0.00;
		sum++;
		System.out.println("生產了車子");
	}
	// Method
	public void setCar49(int n, double g){
		num = n;
		gas = g;
		System.out.println("將車號設為:" + this.num + "\n" + "汽油量設為:" + this.gas);
	}
	
	public static void showSum(){
		System.out.println("車子總共有" + sum + "台"); // 類別方法
	}
	
	public void show(){
		System.out.println("車號是:" + this.num);
		System.out.println("汽油量是" + this.gas);
	}
			
}