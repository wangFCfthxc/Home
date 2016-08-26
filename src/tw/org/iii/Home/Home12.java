package tw.org.iii.Home;

public class Home12 {

	public static void main(String[] args) {
		double dhig = 175.05;
		System.out.println("身高是" + dhig + "公分");
		System.out.println("指定給int型態的變數");
		int ihig = (int) dhig; //將指定運算式的資料型態，強制轉換為括號中所指定的型態
		System.out.println("身高是" + ihig + "公分");

	}

}
