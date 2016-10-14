package tw.org.iii.Home;

public class Sample145V2 {
	// throws 不處理例外(把例外交給其他方法去處理)
	public static void main(String[] args) throws CarException {
		Car145 MyCar = new Car145();
		MyCar.setCar(5462, -35.6);
		MyCar.show();
		

	}

}
