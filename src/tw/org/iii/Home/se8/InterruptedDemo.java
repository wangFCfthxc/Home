package tw.org.iii.Home.se8;

public class InterruptedDemo {

	public static void main(String[] args) {
		Thread thread = new Thread(){

			@Override
			public void run() {
				try {
					Thread.sleep(9999);
				} catch (InterruptedException e) {
					System.out.println("打斷 醒了!" + e);
				}	
			}
		};
		thread.start();
		thread.interrupt();	// 主執行緒呼叫thread的interrupt()
	}

}
