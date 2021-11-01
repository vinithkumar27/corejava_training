package practice0111;
import java.io.DataInputStream;
class one
{
	int a,b;
	String check;
	DataInputStream in = new DataInputStream(System.in);
	one()
	{
		System.out.println("check add/sub/mul/div");
		check();
	}
	public void check()
	{
		System.out.println("enter what do you want to check");
	try {
		check =in.readLine();
	}catch(Exception e){}
		if(check.equals("add"))
		{
	       add();	
		}
		else if(check.equals("sub"))
		{
		   sub();	
		}
		else if(check.equals("mul"))
		{
			mul();
		}
		else if(check.equals("div"))
		{
			div();
		}
		else
		{
			System.out.println("enter same as displayed text");
		}
	}
	public void getinput()
	{
		try {
		System.out.println("Enter the value of a");
		a = Integer.parseInt(in.readLine());
		System.out.println("Enter the value of b");
		b = Integer.parseInt(in.readLine());
		}
		catch(Exception e){}
	}
	public void add()
	{
		getinput();
		int add =a+b;
		System.out.println("Addition of a and b is - "+add);
	}
	public void sub()
	{
		getinput();
		int sub =a-b;
		System.out.println("Subtraction of a and b is - "+sub);
	}
	public void mul()
	{
		getinput();
		int mul =a*b;
		System.out.println("Multiplication of a and b is - "+mul);
		
	}
	public void div()
	{
		getinput();
		int div =a/b;
		System.out.println("Division of a and b is - "+div);
	}
}

public class first {

	public static void main(String[] args)
	{
		one obj = new one();
	}

}
