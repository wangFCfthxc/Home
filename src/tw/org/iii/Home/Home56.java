package tw.org.iii.Home;

public class Home56 {

	public static void main(String[] args) {
		Car56 MyCar = new Car56();
		MyCar.show();
		
		MyCar.setCar(4564, 56.2);
		MyCar.setName("阿斯拉");
		
		MyCar.show();
	}
}

class Car56{
	// Field
	private int num;
	private double gas;
	private String name;
	// Constructor
	public Car56(){
		num = 0;
		gas = 0.0;
		name = "沒有名稱";
		System.out.println("生產車子");
	}
	// Method
	public void setCar(int n, double g){
		num = n;
		gas = g;
		System.out.println("將車號設為:" + num + " " + "汽油量設為:" + gas);
	}
	public void setName(String nm){
		name = nm;
		System.out.println("將車名設為:" + name);
	}
	public void show(){
		System.out.println("車牌是:" + num);
		System.out.println("汽油量是:" + gas);
		System.out.println("車名是:" + name);
	}
}
