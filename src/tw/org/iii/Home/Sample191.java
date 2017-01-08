package tw.org.iii.Home;

import javax.swing.JApplet;
import javax.swing.JLabel;

public class Sample191 extends JApplet{
	private JLabel lb;
	
	public void init(){
		lb = new JLabel();		// 建立元件
		
		lb.setText("安安你好");	// 設定元件
		
		add(lb);				// 將元件新增到容器中
	}

}
