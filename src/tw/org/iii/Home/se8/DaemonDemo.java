package tw.org.iii.Home.se8;

public class DaemonDemo {

	public static void main(String[] args) {
		Thread thread = new Thread(() -> {
			while(true){
				System.out.println("Orz");
			}
		});
		thread.setDaemon(true);
		thread.start();

	}

}
