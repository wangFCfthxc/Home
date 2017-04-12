package tw.org.iii.Home.se8;



public class AutoClosableDemo {

	public static void main(String[] args) {
		try(Resource res = new Resource()){
			res.doSome();
		}catch(Exception ex){
			ex.printStackTrace();
		}

	}

}

class Resource implements AutoCloseable{
	void doSome(){
		System.out.println("做了一些事");
	}

	@Override
	public void close() throws Exception {
		System.out.println("資源被關閉");
		
	}
	
}
