package tw.org.iii.Home;

public class Home01 {

	public static void main(String[] args) {
		int p1, p2, p3, p4, p5, p6, p7, p8, p9;
		p1 = p2 = p3 = p4 = p5 = p6 = p7 = p8 = p9 = 0;

		for (int i = 0; i < 1000; i++) {
			int point = (int) (Math.random() * 9 + 1); // 1 - 6
			switch (point) {
			case 1:
				p1++;
				break;
			case 2:
				p2++;
				break;
			case 3:
				p3++;
				break;
			case 4:
				p4++;
				break;
			case 5:
				p5++;
				break;
			case 6:
				p6++;
				break;
			case 7:
				p4++;
				break;
			case 8:
				p5++;
				break;
			case 9:
				p6++;
				break;
			
				
			}
		}
		System.out.println("1:" + p1);
		System.out.println("2:" + p2);
		System.out.println("3:" + p3);
		System.out.println("4:" + p4);
		System.out.println("5:" + p5);
		System.out.println("6:" + p6);

	}

}