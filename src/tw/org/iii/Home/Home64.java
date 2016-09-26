package tw.org.iii.Home;

public class Home64 {

	public static void main(String[] args) {
		// 傳回「該物件究竟屬於哪一個類別」這樣的相關資訊
		Car[] Cars = new Car[2];
		
		Cars[0] = new Car();
		Cars[1] = new RacingCar();
		
		for(int i=0; i<Cars.length; i++){
			Class c1 = Cars[i].getClass();
			System.out.println("第" + (i+1) + "個物件的類別是" + c1);
		}
	}

}
