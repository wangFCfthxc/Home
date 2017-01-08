package tw.org.iii.Home.se8;

public class OverloadBoxing {
	public static void main(String[] args) {
		Some s = new Some();
		s.someMethod(new Integer(1));

	}

}

class Some{
	void someMethod(int i){
		System.out.println("int 版本被呼叫");
	}
	
	void someMethod(Integer integer){
		System.out.println("Integer 版本被呼叫");
	}
}