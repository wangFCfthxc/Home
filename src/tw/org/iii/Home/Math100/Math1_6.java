package tw.org.iii.Home.Math100;

import java.awt.Color;
import java.awt.Point;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Math1_6 {

	public static void main(String[] args) {
		JFrame f = new JFrame("國際象棋棋盤"); // 建立視窗
		f.setSize(255, 278); // 視窗設定大小
		// 視窗設定位置
		Point point = new Point(400, 600);
		f.setLocation(point);

		int grids = 3; // 行數和列數
		int gridsize = 30; // 儲存格的高和寬

		for (int i = 0; i < grids; i++) { // 控制行
			for (int j = 0; j < grids; j++) { // 控制列
				JLabel l = new JLabel(); // 產生標籤實例
				l.setSize(gridsize, gridsize); // 設定標籤大小
				l.setLocation(i * gridsize, j * gridsize); // 設定標籤位置
				if ((i + j) % 2 == 0) {
					l.setBackground(Color.black); // 設定方格為黑色
					l.setOpaque(true); // 設定為不透明
				} else {
					l.setBackground(Color.white); // 設定方格為白色
					l.setOpaque(true); // 設定為不透明
				}
				l.setBorder(BorderFactory.createLineBorder(Color.blue)); // 設定邊界為黑色
				f.add(l); // 增加標籤
			}
		}
		f.setVisible(true); // 顯示視窗

	}

}
