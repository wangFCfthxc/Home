package tw.org.iii.Home.se8;

public class DeepCopy {

	public static void main(String[] args) {
		Clothes3[] c1 = { new Clothes3("red", 'L'), new Clothes3("blue", 'M') };
		Clothes3[] c2 = new Clothes3[c1.length];
		for (int i = 0; i < c1.length; i++) {
			Clothes3 c = new Clothes3(c1[i].color, c1[i].size);
			c2[i] = c;
		}
		c1[0].color = "yellow";
		System.out.println(c2[0].color);

	}

}

class Clothes3 {
	String color;
	char size;

	Clothes3(String color, char size) {
		this.color = color;
		this.size = size;
	}
}