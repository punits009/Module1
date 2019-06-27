package EX10;

public class CopyRunnable {
	public static void main(String[] args) throws InterruptedException {
		CopyDataThread ob=new CopyDataThread();
		Thread t1=new Thread(ob,"reader");
		t1.start();
		
		
	}
	
	
}
