package practice0211;
import java.util.*;
class red
{
	Scanner in = new Scanner(System.in);
	 red()
	 {
		 System.out.println("enter your first character value");
		 char name1 =in.next().charAt(0);
		 System.out.println("enter your second character value");
		 char name2 = in.next().charAt(0);
		 String result =(name1==name2)?"equal":"not equal";
		 System.out.println(result);
		 
	 }
}
public class third {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
        red obj = new red();
	}

}
