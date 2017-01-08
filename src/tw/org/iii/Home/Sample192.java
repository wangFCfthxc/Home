package tw.org.iii.Home;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

public class Sample192 extends JFrame {

	private JButton jb;
	private JLabel lb;
	private JTextArea edit;

	public Sample192() {
		super("My Window App");

		jb = new JButton("購買");
		// lb = new JLabel("歡迎光臨");
		edit = new JTextArea("歡迎光臨");

		setSize(600, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new BorderLayout());
		JPanel top = new JPanel(new FlowLayout(FlowLayout.CENTER));
		top.add(jb);

		add(top, BorderLayout.NORTH);
		add(edit, BorderLayout.CENTER);

		jb.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dojb();

			}
		});

		addMouseListener(new MouseListener() {
		});

	}

	class MouseListener extends MouseAdapter {

		@Override
		public void mouseClicked(MouseEvent e) {
			edit.setText("謝謝惠顧");
		}
	}

	private void dojb() {
		edit.setText("謝謝惠顧");
	}

	public static void main(String[] args) {
		new Sample192();
	}
}
