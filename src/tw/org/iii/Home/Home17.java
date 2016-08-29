package tw.org.iii.Home;

import javax.swing.JOptionPane;

public class Home17 {

	public static void main(String[] args) {
		String In = 
				JOptionPane.showInputDialog("請輸入整數");
		int Input = Integer.parseInt(In);
		System.out.println(Input);
		
		if(Input == 1)
			System.out.println("輸入的是" + Input);
			System.out.println("PASS");
		
		System.out.println("DOWN");

	}

}
