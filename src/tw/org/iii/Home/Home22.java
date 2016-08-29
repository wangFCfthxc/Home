package tw.org.iii.Home;

import javax.swing.JOptionPane;

public class Home22 {

	public static void main(String[] args) {
		String in = JOptionPane.showInputDialog("請輸入整數");
		int input = Integer.parseInt(in);
		switch (input) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
			System.out.println("輸入範圍0~10");
			break;
		default:
			System.out.println("超過範圍");
			break;

		}

	}

}
