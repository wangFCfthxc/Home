package tw.org.iii.Home.se8;

public class IntegerDemo {

	public static void main(String[] args) {
//		  int data1 = 10;
//        int data2 = 20;
//        
//        Integer wrapper1 = new Integer(data1);
//        Integer wrapper2 = new Integer(data2);
//        
//        System.out.println(data1 / 3);
//        System.out.println(wrapper1.doubleValue() / 3);
//        System.out.println(wrapper1.compareTo(wrapper2));
		
		// Auto boxing
		Integer data1 = 10;
		Integer data2 = 20;
		System.out.println(data1.doubleValue() / 3);
		/* 	java.lang.Integer.compareTo(Integer anotherInteger)
		    the value 0 if this Integer is equal to the argument Integer; 
			a value less than 0 if this Integer is numerically less than the argument Integer;
			and a value greater than 0 if this Integer is numerically greater than the argument Integer (signed comparison).
		*/	
		System.out.println(data1.compareTo(data2));
		
		Integer number = 10;	// 自動裝箱
		int aub = number;		// 自動拆箱
		System.out.println(number + 10);
		System.out.println(number++);
		System.out.println(number);
		
		Boolean foo = true;
		System.out.println(foo && false);
		

	}

}
