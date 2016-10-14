package tw.org.iii.Home;

public class Exercise152 {

	public static void main(String[] args) {
		Car152 myCar = new Car152("myCAR");
		Thread th1 = new Thread(myCar);
		th1.start();
		
		Car152 urCar = new Car152("urCAR");
		Thread th2 = new Thread(urCar);
		th2.start();
		
		for(int i=0; i<5; i++){
			System.out.println("正在進行main()的處理工作");
		}
	}
}
class Car152 implements Runnable{
	private String name;
	public Car152(String nm){
		name =nm;
	}
	
	public void run(){
		for (int i=0; i<5; i++){
			System.out.println("正在處理" + name + "的工作");
		}
	}
}