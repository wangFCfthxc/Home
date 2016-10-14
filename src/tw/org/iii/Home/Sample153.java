package tw.org.iii.Home;

public class Sample153 {
// 暫時停止執行緒
	public static void main(String[] args) {
		Car153 myCar = new Car153("法拉利");
		myCar.start();
		
		for(int i=0; i<5; i++){
		
			System.out.println("正在進行main()的處理工作");
		}
	}
}

class Car153 extends Thread{
	private String name;
	
	public Car153(String nm){
		name = nm;
	}
	public void run(){
		for(int i=0; i<5; i++){
			try {
				sleep(1000);
				System.out.println(name + "的工作處理中");
			} catch (InterruptedException e) {
			}
		}
	}
}
