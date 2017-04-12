package tw.org.iii.Home.se8;

public class TortoiseHareRace2 {

	public static void main(String[] args) {
		Tortoise tortoise = new Tortoise(10);
        Hare hare = new Hare(10);
        
        Thread tortoiseThread = new Thread(tortoise);
        Thread hareThread = new Thread(hare);
        hareThread.start();
        tortoiseThread.start();
        
	}

}
