package tw.org.iii.Home.se8;

public class Ocean {

	public static void main(String[] args) {
		doSwim(new Anemonefish("尼莫"));
		doSwim(new Shark("蘭尼"));
		doSwim(new SwimPlayer("賈斯汀"));
		doSwim(new Submarine("黃色一號"));
		doSwim(new Seaplane("空軍一號"));
		doSwim(new FlyingFish("蝙蝠魚"));
		

	}

	static void doSwim(Swimmer swimmer) {
		swimmer.swim();
	}

}
