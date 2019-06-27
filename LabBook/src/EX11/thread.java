package EX11;

import java.util.concurrent.TimeUnit;

public class thread implements Runnable{

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
			}
			if(i==10)
			{
				i=0;
				System.out.println("10 timer out");
			}
		}
		
	}
	

}
