package EX13;

public class USPA {
	public static void main(String args[])
	{
		String user="Ram";
		String pass="123";
		UserPass us=(u,p)->{if(u.equals(user) && p.equals(pass))
		{
			System.out.println("User autheciated= "+true);
		}
		else
		{
			System.out.println("User Authenciated= "+false);
		}
			
			
		};
		us.verify("Ram", "123");
	}

}
