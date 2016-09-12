package tw.org.iii.Home;

public class Home45 {

	public static void main(String[] args) {
		CarV1 MyCar = new CarV1();
//		MyCar.num = 4567;
//		MyCar.gas = 31.66;
		
		MyCar.setCar(5688, 12.5);		
		MyCar.show();
		
		// 設定錯誤油量看看
//		MyCar.setCar(5688, -123);
//		MyCar.show();
		
		// 多載>呼叫參數為int型態的方法
		MyCar.setCar(2422);
		MyCar.show();
		// 多載>呼叫參數為double型態的方法
		MyCar.setCar(12.666);
		MyCar.show();
		
	}
}

class CarV1 {
	private int num;
	private double gas;
	// Method多載
	public void setCar(int n, double g){
		if(g>0 && g<100){
			num = n;
			gas = g;
			System.out.println("將車號設為:" + num + "\n" + "將汽油量設為:" + gas);
		}
		else{
			System.out.println(g + "不是正確汽油量" + "\n" + "無法變更");
		}
	}
	public void setCar(int n){
		num = n;
		System.out.println("將車號設為:" + num);
	}
	
	public void setCar(double g){
		gas = g;
		System.out.println("將汽油量設為:" + gas);
	}
	
	public void show(){
		System.out.println("車號是:" + num);
		System.out.println("汽油量是:" + gas);
	}
}