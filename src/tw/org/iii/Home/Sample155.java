package tw.org.iii.Home;

public class Sample155 {
// 等待執行緒處理完畢
	public static void main(String[] args) {
		Car153 myCar = new Car153("myCar");
		myCar.start();
		
		try {
			myCar.join();
			
		} catch (InterruptedException e) {}
		
		System.out.println("結束main()的處理工作");
	}

}
