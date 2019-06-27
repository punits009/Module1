package E8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Print {
	public static void main(String rgs[]) throws IOException
	{
		try {
			System.out.println("Reading under process");
			FileReader fr=new FileReader("D:\\file.txt");
			BufferedReader br=new BufferedReader(fr);
			String st;int l=1;
			while((st=br.readLine())!=null)
			{
				System.out.println((l++)+" "+st);
			}
			br.close();
			fr.close();
		
	}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}

}}
