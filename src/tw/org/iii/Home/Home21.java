package tw.org.iii.Home;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;

import com.sun.imageio.spi.InputStreamImageInputStreamSpi;

public class Home21 {

	public static void main(String[] args) throws IOException {
		System.out.println("請輸入兩個整數");
		BufferedReader in=
				new BufferedReader(new InputStreamReader(System.in));
		String str1 = in.readLine();
		String str2 = in.readLine();
		
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		
		if (num1 == num2){
			System.out.println(num1 + "等於" + num2);
		}
		else if (num1 > num2){
			System.out.println(num1 + "大於" + num2);
		}
		else if (num1 < num2){
			System.out.println(num1 + "小於" + num2);
		}
		

	}

}
