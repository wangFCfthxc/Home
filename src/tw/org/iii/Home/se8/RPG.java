package tw.org.iii.Home.se8;

public class RPG {

	public static void main(String[] args) {
		demoSwordMan();
		demoMagician();

	}

	static void demoMagician() {
		Magician magician = new Magician();
		magician.setLevel(1);
		magician.setBlood(200);
		magician.setName("Panda");
		System.out.printf("魔法師:(%s, %d, %d)%n", magician.getName(), magician.getLevel(), magician.getBlood());
	}

	static void demoSwordMan() {
		SwordMan swordman = new SwordMan();
		swordman.setLevel(1);
		swordman.setBlood(500);
		swordman.setName("PPAP");
		System.out.printf("劍士:(%s, %d, %d)%n", swordman.getName(), swordman.getLevel(), swordman.getBlood());

	}

}
