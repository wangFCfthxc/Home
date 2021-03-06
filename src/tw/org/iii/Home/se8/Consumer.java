package tw.org.iii.Home.se8;

public class Consumer implements Runnable{
	private Clerk clerk;
	
	public Consumer(Clerk clerk) { 
        this.clerk = clerk; 
    }
	

	@Override
	public void run() {
		System.out.println("消費者開始消耗整數......"); 
        for(int i = 1; i <= 10; i++) { 
            try {
                clerk.getProduct(); 
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }
        } 
		
	}

}
