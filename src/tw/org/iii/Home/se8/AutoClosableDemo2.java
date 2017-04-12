package tw.org.iii.Home.se8;

public class AutoClosableDemo2 {

	public static void main(String[] args) {
		try (ResourceSome some = new ResourceSome(); ResourceOther other = new ResourceOther()) {
			some.doSome();
			other.doOther();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}

class ResourceSome implements AutoCloseable {
	void doSome() {
		System.out.println("做一些事");
	}

	@Override
	public void close() throws Exception {
		System.out.println("資源Some被關閉");

	}
}

class ResourceOther implements AutoCloseable {
	void doOther() {
		System.out.println("做其他事");
	}

	@Override
	public void close() throws Exception {
		System.out.println("資源Other被關閉");

	}
}
