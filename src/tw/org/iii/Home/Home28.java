package tw.org.iii.Home;

public class Home28 {
// 內外2個迴圈就是巢狀迴圈 for.while皆可
	public static void main(String[] args) {
		for(int i=0; i<5; i++){ // 外圍迴圈總共執行5次
			for(int j=0; j<3; j++){ // 內側的迴圈總共執行3次
				System.out.println("i是" + i + ":j是" + j); // 外圍執行1次.內側就執行3次
			}
		}
	}

}
