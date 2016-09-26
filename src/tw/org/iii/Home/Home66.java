package tw.org.iii.Home;

public class Home66 {

	public static void main(String[] args) {
		Vehicle[] vc = new Vehicle[2];
		vc[0] = new Carv2(1234, 20.5);
		vc[1] = new Plane(232);
		
		for(int i=0; i<vc.length; i++){
			if(vc[i] instanceof Carv2)
				System.out.println("第" + (i+1) + "個物件是Carv2類別");
			else if(vc[i] instanceof Plane)
				System.out.println("第" + (i+1) + "個物件是Plane類別");
			else
				System.out.println("XX");
		}

	}

}
