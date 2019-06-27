package E8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_Difference {
	public static void main(String srg[]) throws IOException, ParseException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the dates in dd/mm/yy hours:minutes:seconds");
		String d1=br.readLine();
		String d2=br.readLine();
		SimpleDateFormat f=new SimpleDateFormat("dd/mm/yy HH:mm:ss");
		java.util.Date dat1=f.parse(d1);
		Date dat2=f.parse(d2);
		long diff=dat2.getTime()-dat1.getTime();
		long diffsec=diff/1000;
		long diffmin=diff/(60*1000);
		long diffho=diff/(60*60*1000);
		long days=diffho/24;
		long months=days/30;
		long year=months/12;
		System.out.println(diffsec);
		System.out.println(diffmin);
		System.out.println(diffho);
		System.out.println(days);
		System.out.println(months);
		System.out.println(year);
		
	}

}
