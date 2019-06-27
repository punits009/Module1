package E8;
import java.io.*;
import java.util.Arrays;
public class PositiveString {
	public static void main(String srg[])
	{
	try {
		
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the string");
			String st=br.readLine();
			char c[]=st.toCharArray();
			Arrays.sort(c);
			String s1=String.valueOf(c);
			if(st.equals(s1))
			{
				System.out.println("Positive String");
			}
			else
			{
				System.out.println("Not a positive String");
			}
			
	} 
	catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}
}



