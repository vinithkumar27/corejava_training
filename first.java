package practice0211;
import java.util.*;
class one
{
	//check max number between two numbers
	Scanner in = new Scanner(System.in);
	 one()
	 {
		System.out.println("enter the value to check which is max number");
		System.out.println("enter the value of a ");
		int a = in.nextInt();
		System.out.println("enter the value of b ");
		int b = in.nextInt();
		if(a>b)
		{
			System.out.println("value of a is bigger than b");
		}
		else if(a<b)
		{
			System.out.println("value of b is bigger than a");
		}
		else
		{
			System.out.println("the entered value of a and b is equal");
		}
		 
	 }
}

public class first {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
       one obj = new one();
	}

}
