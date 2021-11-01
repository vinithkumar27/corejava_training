package practice0111;
import java.util.*;
public class ninth {

	public static void main(String[] args)
	{//get all even indexes only
		String[] x=new String[10];
		Scanner in = new Scanner(System.in);
		System.out.println("enter the array values to add in even places");
	  for(int i=0;i<x.length;i++)
	  {
		if(i%2==0)
		{
			x[i]=in.nextLine();
		}
	  }
	  for(int j=0;j<x.length;j++)
	  {
		  System.out.println(x[j]);
	  }
	}
}