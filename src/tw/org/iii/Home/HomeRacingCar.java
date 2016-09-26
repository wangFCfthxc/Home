package tw.org.iii.Home;

public class HomeRacingCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}

class RacingCar extends Car{
	// Field
	private int course;
	// Constructor
	public RacingCar(){
		course = 0;
		System.out.println("生產了賽車");
	}
}