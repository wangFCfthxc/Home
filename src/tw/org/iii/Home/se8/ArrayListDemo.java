package tw.org.iii.Home.se8;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		Thread thread1 = new Thread(() -> {
            while (true) {
                list.add(1);
            }
        });
		
		Thread thread2 = new Thread(() -> {
            while (true) {
                list.add(2);
            }
        });
		
		thread1.start();
        thread2.start();

	}

}
