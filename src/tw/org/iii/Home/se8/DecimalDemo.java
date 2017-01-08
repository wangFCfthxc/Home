package tw.org.iii.Home.se8;

import java.math.BigDecimal;

public class DecimalDemo {

	public static void main(String[] args) {
//		double a = 0.1;
//		double b = 0.1;
//		double c = 0.1;
//
//		if ((a + b + c) == 0.3) {
//			System.out.println("等於0.3");
//		} else {
//			System.out.println("不等於0.3");
//			System.out.println(a + b + c);
//		}
		BigDecimal operand1 = new BigDecimal("1.0");
        BigDecimal operand2 = new BigDecimal("0.8");
        BigDecimal result = operand1.subtract(operand2);
		System.out.println(result);
	}

}
