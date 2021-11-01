package practice0111;
import java.util.*;
class kiddo
{
	//fibonacci series
	Scanner in = new Scanner(System.in);
	kiddo()
	{
	 int value1=0;
	 int value2=1;
	 int value3=0;
	 System.out.println("enter the fibinocci value");
	 int x=in.nextInt();
	 System.out.println("0");
	 for(int i=1;i<x;i++)
	 {
		 value3 =value1+value2;
		 System.out.println(value3);
		 value1=value2;
		 value2=value3;
	 } 
	}
}

public class fourth 
{
	public static void main(String[] args) 
	{
         kiddo obj = new kiddo();
	}
}
