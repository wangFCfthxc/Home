package tw.org.iii.Home;

public class Home29 {
// 巢狀迴圈加上if敘述
	public static void main(String[] args) {
		boolean b1 = false;
		for(int i=0; i<5; i++){
			for(int j=0; j<5; j++){
				if(b1 == false){
					System.out.print("★");
					b1 = true;
				}
				else{
					System.out.print("-");
					b1 = false;
				}
			}
			System.out.println("\n");
		}
	}

}
