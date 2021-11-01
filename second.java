package practice0111;
import java.util.*;
public class second 
{
	 static Scanner in =  new Scanner(System.in);
	public static void main(String[] args)
	{
         third obj = new third();
         System.out.println(obj.getMargo());
         System.out.println("change margo soap value");
         int margo1 = in.nextInt();
         obj.setMargo(margo1);
         System.out.println("the new price of margo is "+obj.getMargo());
         
	}
}
