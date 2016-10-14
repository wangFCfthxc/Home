package tw.org.iii.Home;

public class Sample145 {
	// 拋出例外處理(直接在該方法中處理)
	public static void main(String[] args) {
		Car145 MyCar = new Car145();
		try {
			MyCar.setCar(4562, -12.654);
		} catch (CarException e) {
			System.out.println("例外拋出" + e);
		}
		MyCar.show();
	}
}

class CarException extends Exception{
	
}

class Car145{
	private int num;
	private double gas;
	
	public Car145(){
		num = 0;
		gas = 0.0;
		System.out.println("以生產了汽車");
	}
	public void setCar(int n,double g) throws CarException{
		if(g < 0){
			CarException e = new CarException();
			throw e;
		}
		else{
			num = n;
			gas = g;
			System.out.println("設定車號:" + num + "\n" + "設定汽油量為:" + gas);
		}				
	}
	public void show(){
		System.out.println("車號是:" + num);
		System.out.println("汽油量是:" + gas);
	}
}
