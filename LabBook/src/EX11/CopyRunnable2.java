package EX11;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CopyRunnable2 extends CopyDataThread {
	
	public static void main(String[] args) throws InterruptedException {
		
		ExecutorService executor=Executors.newSingleThreadExecutor();
		CopyDataThread c=new CopyDataThread();
		Runnable r=c::run;
		executor.execute(r);
		executor.shutdown();
		
		
	}
	
	
}
