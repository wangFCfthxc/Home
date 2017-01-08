package tw.org.iii.Home.se8;

public class RPG_v2 {

	public static void main(String[] args) {
		SwordMan swordman = new SwordMan();
		swordman.setName("Justin");
		swordman.setLevel(1);
		swordman.setBlood(200);
		
		Magician magician = new Magician();
		magician.setName("Monica");
		magician.setLevel(1);
		magician.setBlood(100);
		
		drawFight(swordman);
		drawFight(magician);

	}
	
	static void drawFight(Role role){
		System.out.print(role.getName());
		role.fight();
	}

}
