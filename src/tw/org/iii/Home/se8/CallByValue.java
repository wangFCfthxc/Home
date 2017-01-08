package tw.org.iii.Home.se8;

public class CallByValue {

	public static void main(String[] args) {
		Customer c1 = new Customer("Panda");
		some(c1);
		System.out.println(c1.name);
		
		Customer c2 = new Customer("Panda2");
		other(c2);
		System.out.println(c2.name);

	}

	static void some(Customer c) {
		c.name = "Henry";
	}
	
	static void other(Customer c) {
		c = new Customer("Bill");
	}

}

class Customer{
	String name;
	Customer(String name) {
		this.name = name;
	}
}