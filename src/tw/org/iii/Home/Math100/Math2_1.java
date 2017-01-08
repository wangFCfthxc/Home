package tw.org.iii.Home.Math100;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Math2_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	// 取得主控台輸入物件
		System.out.println("請輸入起始年份：");
		int year = input.nextInt();	// 從鍵盤接收起始年分
		System.out.println("請輸入打算輸出未來幾年：");	
		int n = input.nextInt();	// 從鍵盤輸出打算輸出幾年
		getBlackFri(year,n);	// 呼叫"getBlackFri"方法

	}
	public static void getBlackFri(int year, int n){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd E");	// 日期格式物件
		
		int k=0;
		Calendar cal = Calendar.getInstance();	// 獲得日曆物件
		while(k<n){	// 外迴圈控制年分
			for(int i=0; i<12; i++){	// 內迴圈控制月份
				cal.set(year, i, 13);	// 設定日期
				if(5==(cal.get(Calendar.DAY_OF_WEEK)-1)){	// 判斷是否是星期五
					System.out.println("黑色星期五:" + sdf.format(cal.getTime()));		// 輸出格式化日期
				}
			}
			year++;		// 年份增加
			k++;
		}
	}

}
