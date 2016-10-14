package tw.org.iii.Home;

public class Sample157 {
// 同步化                                                                                       
	public static void main(String[] args) {
		Company cmp = new Company();
		
		Driver drv1 = new Driver(cmp);
		drv1.start();
		
		Driver drv2 = new Driver(cmp);
		drv2.start();
	}
}

class Company {
	private int sum = 0;
	public synchronized void add(int a){		// synchronized 當某個執行緒正在處理這個方法時，其他執行緒就無法呼叫出這個方法
		int tmp = sum;
		System.out.println("目前的合計金額是" + tmp + "元");
		System.out.println("賺到" + a + "元了");
		tmp = tmp + a;
		System.out.println("合計金額:" + tmp +"元");
		sum = tmp;
	}
}
class Driver extends Thread{
	private Company comp;
	public Driver(Company c){
		comp = c;
	}
	public void run(){
		for(int i=0; i<3; i++){
			comp.add(50);
		}
	}
}