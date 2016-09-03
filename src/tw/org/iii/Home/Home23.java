package tw.org.iii.Home;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Home23 extends JFrame {

	private JButton Go;
	private JTextArea edit;
	private JTextField input;
	String output, setout, answer;
	private StringBuffer bf;
	boolean isWin;
	int count;

	public Home23() {
		// 視窗標題
		super("猜數字視窗版");

		// 謎底
		answer = createAnswer(3);
		System.out.println(answer);

		// 按鈕.顯示.輸入
		Go = new JButton("猜");
		edit = new JTextArea();
		input = new JTextField(50);
		bf = new StringBuffer();

		// 放入元件
		setLayout(new BorderLayout());
		JPanel top = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		top.add(input);
		top.add(Go);
		add(edit, BorderLayout.CENTER);
		add(top, BorderLayout.NORTH);

		// 顯示.視窗大小.關閉
		setVisible(true);
		setSize(640, 540);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Go.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (doGo())
					return;
				if (count > 2) {
					JOptionPane.showMessageDialog(null, "蝦~魯蛇\n答案是" + answer);

				}

			}
		});

	}

	// 開始猜
	private boolean doGo() {
		// System.out.println("觸發");
		count++;
		output = input.getText().toString();
		isWin = false;
		if (answer.equals(output)) {
			JOptionPane.showConfirmDialog(null, "過關", "", JOptionPane.CLOSED_OPTION);
			return true;
		} else {
			String result = checkAB(answer, output);
			setout = (output + ":" + result + "\n");
			bf.append(setout);
			edit.setText(bf.toString());
			return false;
		}
	}

	public static void main(String[] args) {
		new Home23();

	}

	static String checkAB(String a, String g) {
		int A, B;
		A = B = 0;
		for (int i = 0; i < g.length(); i++) {
			if (g.charAt(i) == a.charAt(i)) {
				A++;
			} else if (a.indexOf(g.charAt(i)) != -1) {
				B++;
			}
		}
		return A + "A" + B + "B";
	}

	static String createAnswer(int n) {
		// 洗牌
		int[] poker = new int[n]; // 0,0,...0
		int rand;
		boolean isOK;
		for (int i = 0; i < poker.length; i++) {

			do {
				rand = (int) (Math.random() * 10);
				// 檢查機制
				isOK = true;
				for (int j = 0; j < i; j++) {
					if (poker[j] == rand) {
						isOK = false;
						break;
					}
				}

			} while (!isOK);

			poker[i] = rand;
			// System.out.println(poker[i]);
		}
		String ret = "";
		for (int v : poker)
			ret += v;

		return ret;
	}

}
