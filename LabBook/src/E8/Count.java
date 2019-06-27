package E8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Count {
	public static void main(String rgs[]) throws IOException
	{
		try {
			System.out.println("Reading under process");
			FileReader fr=new FileReader("D:\\file.txt");
			BufferedReader br=new BufferedReader(fr);
			int st;int l=1,ns=0,nl=1;
			while((st=br.read())!=-1)
			{
				l++;
				if(st==' ')
				{
					ns++;
				}
				if(st=='\n')
				{
					nl++;
				}
			
			}
			System.out.println((l-nl)+" "+ns+" "+nl);
			br.close();
			fr.close();
		
	}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}

}}
