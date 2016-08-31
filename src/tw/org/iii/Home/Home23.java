package tw.org.iii.Home;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Home23 extends JFrame{
		
	private JButton Go;
	private JTextArea edit;
	private JTextField input;
	
	public Home23(){
		// 視窗標題
		super ("猜數字視窗版");
		
		// 按鈕.顯示.輸入
		Go = new JButton("猜");
		edit = new JTextArea();
		input = new JTextField(50);
		
		// 放入元件
		setLayout(new BorderLayout());
		JPanel top = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		top.add(input); top.add(Go);
		add(edit, BorderLayout.CENTER);
		add(top, BorderLayout.NORTH);
		
		// 顯示.視窗大小.關閉
		setVisible(true);
		setSize(640, 540);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		new Home23();

	}

}
