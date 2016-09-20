package tw.org.iii.Home;

public class Home57 {

	public static void main(String[] args) {
		// 使用陣列儲存多個物件
		Car57[] MyCars = new Car57[3];
		for(int i=0; i<MyCars.length; i++){
			MyCars[i] = new Car57();
		}
		
		MyCars[0].setCar(8591, 26.7);
		MyCars[1].setCar(9521, 23.2);
		MyCars[2].setCar(8888, 35.444);
		for(int i=0; i<MyCars.length; i++){
			MyCars[i].show();
		}
		
	}
}

class Car57{
	// Field
	private int num;
	private double gas;
	// Constructor
	public Car57(){
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
	// Method
	public void setCar(int n,double g){
		num = n;
		gas = g;
		System.out.println("將車牌設為:" + num + " " +"汽油量是:" + gas);
	}
	
	public void show(){
		System.out.println("車牌是:" + num + "\n" + "汽油量是:" + gas);
	}
}