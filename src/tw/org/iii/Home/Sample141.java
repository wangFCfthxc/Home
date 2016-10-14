package tw.org.iii.Home;

public class Sample141 {
// 處理例外141,142		
	public static void main(String[] args) {
		try{
		int[] test = new int[5];
		System.out.println("將值指定給test[10]");
		
		test[10] = 100;
		System.out.println("將100指定給test[10]");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
		System.out.println("順利地執行完畢");

	}

}
