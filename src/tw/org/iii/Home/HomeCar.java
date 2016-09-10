package tw.org.iii.Home;

public class HomeCar {

	public static void main(String[] args) {
//		Car car1;
//		car1 = new Car();
		Car MyCar = new Car();
		Car UrCar = new Car();
		
//		int number = 2346;
//		double gastest = 20.3948;
		
//		UrCar.num = 4321;
//		UrCar.gas = 7.34;
//		MyCar.num = 1234;
//		MyCar.gas = 26.4;
		
//		System.out.println("我的車號是" + MyCar.num);
//		System.out.println("我的汽油油量是" + MyCar.gas);
//		System.out.println("你的車號是" + UrCar.num);
//		System.out.println("你的汽油油量是" + UrCar.gas);
		
//		MyCar.setNum(number);
//		MyCar.setGas(gastest);
		
		MyCar.setNumGas(2351, 23.54);
		int number = MyCar.getNum();
		double gasout = MyCar.getGas();
		
		System.out.println("調查傳回");
		System.out.println("車號是" + number + "\n" + "汽油量是" + gasout);
//		MyCar.show();
		
	
	}
}

class Car{
	// Field
	int num;
	double gas;
	
	int getNum(){
		System.out.println("調查車號");
		return num;
	}
	double getGas(){
		System.out.println("調查汽油量");
		return gas;
	}
	// Method
//	void setNum(int n){
//		num = n;
//		System.out.println("將車號設為" + num);
//	}
//	void setGas(double g){
//		gas = g;
//		System.out.println("將汽油油量設為" + gas);
//	}
	void setNumGas(int n, double g){
		num = n;
		gas = g;
		System.out.println("將車號設為" + num);
		System.out.println("將油量設為" + gas);
		
		return;
	}
	void show(){
		System.out.println("車號是" + this.num);
		System.out.println("汽油量是" + this.gas);
	}
	void showCar(){
		System.out.println("開始顯示車子的資料");
		this.show();
	}
}
