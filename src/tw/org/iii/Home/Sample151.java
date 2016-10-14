package tw.org.iii.Home;

public class Sample151 {
	public static void main(String[] args){
		Car151 myCar = new Car151("法拉利");
		myCar.start();
		Car151 urCar = new Car151("保時捷");
		urCar.start();
		Car151 usCar = new Car151("大黃蜂");
		usCar.start();
		
		for(int i=0; i<5; i++){
			System.out.println("正在進行main()的處理工作");
		}
	}
}

class Car151 extends Thread{
	private String name;
	
	public Car151(String nm){
		name = nm;
	}
	public void run(){
		for(int i=0; i<5; i++){
			System.out.println(name + "處理中");
		}
	}	
}

	





