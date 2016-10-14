package tw.org.iii.Home;

public class Sample154 {
// 暫停其他執行緒
	public static void main(String[] args) {
		Car153 myCar = new Car153("法拉利");
		myCar.start();
		
		for(int i=0; i<5; i++){
		try {
			Thread.sleep(1000);
			System.out.println("正在進行main()的處理工作");
		} catch (InterruptedException e) {}
			
		}
	}
}


