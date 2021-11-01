package practice0111;
import java.util.*;
public class seventh
{
//prime number
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args)
	{
		int num1,i,count=0;
        System.out.println("To check the number is prime number or not");
        num1 = in.nextInt();
        for(i=2;i<num1;i++)
        {
           if(num1%i==0)
           {
        	   count++;
        	   break;
           }
        }
        if(count==0)
        	System.out.println("it is prime number");
        else
        	System.out.println("it is not a prime number");
	}

}
