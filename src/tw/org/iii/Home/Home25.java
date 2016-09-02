package tw.org.iii.Home;

import javax.swing.JOptionPane;

public class Home25 {

	public static void main(String[] args) {
		String in =
				JOptionPane.showInputDialog("請問要輸出幾個★?");
		int Input = Integer.parseInt(in);
		for(int i=1; i<=Input; i++){
			System.out.print("★");
		}

	}

}
