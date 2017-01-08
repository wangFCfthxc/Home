package tw.org.iii.Home.se8;

public class SwordMan extends Role {

	@Override
	public void fight() {
		System.out.println("揮劍攻擊");
	}

	@Override
	public String toString() {
		return "劍士" + super.toString();
	}

}
