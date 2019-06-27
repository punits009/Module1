package EX11;
import java.io.*;
import  java.util.*;
import java.util.concurrent.TimeUnit;

public class CopyDataThread implements Runnable {

	int l=0;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int count=0;
		try {
			System.out.println("Reading under process");
			FileReader fr=new FileReader("D:\\file.txt");
			BufferedReader br=new BufferedReader(fr);
			FileWriter fw = new FileWriter("D:\\file1.txt",true);
			int st;
			while((st=br.read())!=-1)
			{
				if(count==10)
				{
				System.out.println("10 character printed");
              	  count=0;
              	  TimeUnit.SECONDS.sleep(5);
				}
				fw.write(st);
				count++;
				fw.flush();
			}
			br.close();
			fr.close();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
                	 
      
		
		



