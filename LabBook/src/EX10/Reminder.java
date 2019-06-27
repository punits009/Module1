package EX10;
import java.util.*;
import java.util.concurrent.TimeUnit;
public class Reminder {
	Timer timer;
	public Reminder(int seconds) {
		// TODO Auto-generated constructor stub
		timer =new Timer();
	    timer.schedule(new RemindTask(), seconds);
	}
	
	class RemindTask extends TimerTask{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			for(int i=1;i<=10;i++)
			{
				System.out.println(i);
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				};
			}
			System.out.println("10 seconds done");
			timer.cancel();
			new Reminder(10);
		}
		}
	public static void main(String args[])
	{
		new Reminder(10);
		System.out.println("Timer Scheduled");
		
		
	}
	

}
