package tw.org.iii.Home;

import javax.swing.JOptionPane;

public class Home52 {

	public static void main(String[] args) {
		String in1 =
				JOptionPane.showInputDialog("請輸入字串");
		String in2 =
				JOptionPane.showInputDialog("請輸入要檢索的文字");
		char ch = in2.charAt(0);
		int num =in1.indexOf(ch);
		
		if(num != -1)
			System.out.println(in1 + "的第" + (num+1) + "個字就是「" + ch + "」");
		else
			System.out.println(in1 + "中沒有「" + ch + "」這個字");
		

	}

}
