package tw.org.iii.Home;

public class Home27 {

	public static void main(String[] args) {
		int i = 1;
		while(i <= 5){ // 條件式true就執行，false才會結束
			System.out.println("第" + i + "迴圈");
			i++; // 少i++; 就變無窮迴圈，因為i不遞增，所以條件式永遠true
		}
		System.out.println("結束");

	}

}
