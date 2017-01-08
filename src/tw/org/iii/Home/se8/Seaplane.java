package tw.org.iii.Home.se8;

public class Seaplane extends Airplane implements Swimmer{

	public Seaplane(String name) {
		super(name);
	}

	@Override
	public void fly() {
		System.out.printf("海上飛機 %s 在飛%n", name);

	}

	@Override
	public void swim() {
		System.out.printf("海上飛機 %s 航行海面%n", name);

	}

}
