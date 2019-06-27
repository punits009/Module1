package EX11;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TimerThread2 extends thread {
	
	public static void main(String[] args) throws InterruptedException {
		
		ExecutorService executor=Executors.newSingleThreadExecutor();
		thread c=new thread();
		Runnable r=c::run;
		executor.execute(r);
		executor.shutdown();
	}
}