package tw.org.iii.Home;

import javax.swing.JOptionPane;

public class Home20 {

	public static void main(String[] args) {
		String in =
				JOptionPane.showInputDialog("請輸入整數");
		int input = Integer.parseInt(in);
		if ((input % 2) == 1){
			System.out.println(input + "是奇數");
		}
		else {
			System.out.println(input + "是偶數");
		}

	}

}
