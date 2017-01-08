package tw.org.iii.Home.se8;

public class FlyingFish extends Fish implements Flyer {
	public FlyingFish(String name) {
		super(name);
	}

	@Override
	public void fly() {
		System.out.println("飛魚會飛");

	}

	@Override
	public void swim() {
		System.out.printf("%s 飛魚游泳", name);

	}

}
