package tw.org.iii.Home;

public class Exercise153 {

	public static void main(String[] args) {
		Car153v2 myCar = new Car153v2("myCAR");
		Thread th = new Thread(myCar);
		th.start();
		
		for(int i=0; i<5; i++){
			System.out.println("正在進行main()的處理工作");
		}
	}
}

class Car153v2 implements Runnable{
	private String name;
	public Car153v2(String nm){
		name = nm;
	}
	public void run(){
		for(int i=0; i<5; i++){
			try {
				Thread.sleep(1000);
				System.out.println("正在處理" + name + "的工作 ");
			} catch (InterruptedException e) {}
		}
	}
}