package tw.org.iii.Home;

public class Sample156 {

	public static void main(String[] args) {
		Car156 myCar = new Car156("測試車");
		Thread th1 = new Thread(myCar);
		th1.run();
		
		for(int i=0; i<5; i++){
			System.out.println("正在處理main()的處理工作");
		}
	}
}

class Car156 implements Runnable{
	private String name;
	
	public Car156(String nm){
		name = nm;	
	}
	public void run(){
		for(int i=0; i<5; i++){
			System.out.println(name + "的工作處理中");
		}
	}
}