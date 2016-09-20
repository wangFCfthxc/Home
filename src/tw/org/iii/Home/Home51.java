package tw.org.iii.Home;

import javax.swing.JOptionPane;

public class Home51 {

	public static void main(String[] args) {
		String in =
				JOptionPane.showInputDialog("請輸入英文字");
		String stru = in.toUpperCase(); // 全部轉大寫
		String str1 = in.toLowerCase(); // 全部轉小寫
		
		System.out.println("轉換成大寫為" + stru);
		System.out.println("轉換成小寫為" + str1);
	}

}
