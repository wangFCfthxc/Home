package tw.org.iii.Home;

import javax.swing.JOptionPane;

public class Home18 {

	public static void main(String[] args) {
		String in =
				JOptionPane.showInputDialog("請輸入整數");
		int input = Integer.parseInt(in);
		
		if(input == 1){
			System.out.println("輸入的是1");
		}
		else if(input == 2){
			System.out.println("輸入的是2");
		}
		else {
			System.out.println("請輸入1 or 2");
		}

	}

}
