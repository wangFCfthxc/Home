package tw.org.iii.Home;

public class Home41 {

	public static void main(String[] args) {
		int[] test1;
		test1 = new int[3];
		System.out.println("宣告陣列test1");
		
		test1[0] = 80; // 指定資料給陣列test1
		test1[1] = 70;	  	
		test1[2] = 50;
		System.out.println("---------");
		
		int[] test2;
		System.out.println("宣告陣列test2");
		test2 = test1; 
		System.out.println("將test1陣列指定給test2陣列");
		
		for(int i=0; i<test1.length; i++){
			System.out.println("test1所指的第" + (i+1) + "人的分數是:" + test1[i] + "分");
		}
		
		for(int i=0; i<test2.length; i++){
			System.out.println("test2所指的第" + (i+1) + "人的分數是:" + test2[i] + "分");
		}
		System.out.println("-------------");
		
		test1[2] = 100;
		for(int i=0; i<test1.length; i++){
			System.out.println("test1所指的第" + (i+1) + "人的分數是:" + test1[i] + "分");
		}
		for(int i=0; i<test2.length; i++){
			System.out.println("test2所指的第" + (i+1) + "人的分數是:" + test2[i] + "分");
		}
		
	}

}
