package practice0211;
import java.util.*;
class pink
{
	Scanner in = new Scanner(System.in);
	pink()
	{
		int[] x=new int[5];
		System.out.println("enter the values to add");
		for(int i=0;i<5;i++)
		{
			x[i]=in.nextInt();
		}
		//using while loop
	    int i=0;
		int add=0;
		while(i<=4)
		{
			add=add+x[i];
			i++;
		}
		System.out.println("add using while loop : "+add);  
		//using do-while loop
		int add1=0;
		int j=0;
		do {
			add1=add1+x[j];
			j++;
		}while(j<=4);
		System.out.println("add using do-while loop : "+add1);
		//using for-loop
		int add2=0;
	for(int k=0;k<5;k++)
	{
		 add2+=x[k];
	}System.out.println("add using for loop : "+add2);
	}
}

public class seventh
{
	public static void main(String[] args)
	{
       pink obj = new pink();
	}
}
