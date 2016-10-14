package tw.org.iii.Home;

public class Sample143 {
// finally + 輸出例外資訊 143,144
	public static void main(String[] args) {
		try{
			
		
		int test[] = new int[5];
		
		System.out.println("指定值到test[10]");
		
		test[10] = 80;
		System.out.println("將80指定到test[10]");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e + "\n" +"超過陣列範圍");
		}
		finally{
			System.out.println("有沒有例外都會執行");
		}
		System.out.println("完畢");

	}

}
