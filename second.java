package practice0211;
import java.util.*;
public class second {

	public static void main(String[] args) 
	{
		//check max between five numbers
		// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        System.out.println("check which one is bigger in five numbers");
        System.out.println("enter five numbers");
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        int d=in.nextInt();
        int e=in.nextInt();
        if((a>b)&&(a>c)&&(a>d)&&(a>e))
        {
           System.out.println("value of a is bigger");	
        }
        else if((b>c)&&(b>d)&&(b>e))
        {
        	System.out.println("value of b is bigger");
        }
        else if((c>d)&&(d>e))
        {
        	System.out.println("value of c is bigger");
        }
        else if(d>e)
        {
        	System.out.println("value of d is bigger");
   		}
        else
        {
        	System.out.println("value of e is bigger");
        }
	}

}
