package EX13;
import java.time.LocalDateTime;
interface printable{
	public void print(Object o);
}
class MyShow{
	public MyShow()
	{
		//auto
	}
	public MyShow(Object o)
	{
		System.out.println("My show constructor "+o);
	}
	public void play(Object o)
	{
		System.out.println("Another object instance method "+o);
	}
		
}

public class MethodReference {

	public static void meth1(Object o)
	{
		System.out.println("Static method "+o);
	}
	public void meth2(Object o)
	{
		System.out.println("Instance Method "+o);
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printable p1= MethodReference::meth1;//print will call static  meth1
		p1.print("welcome to method reference");
		
		MethodReference ob=new MethodReference();
		printable p2=ob::meth2;//print will call meth2
		p2.print(LocalDateTime.now());
		
		MyShow ob1=new MyShow();
		printable p3=ob1::play;//print will call myshow play
		p3.print(new Integer(40));
		
		

	}

}
