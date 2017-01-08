package tw.org.iii.Home.se8;

public abstract class Airplane implements Flyer{
	protected String name;
	
	public Airplane(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public abstract void fly();

}
