package practice0111;
import java.util.*;
public class sixth 
{
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args)
	{
		//amstrong number
        System.out.println("check the no is amstrong number or not");
        int y=in.nextInt();
        int x=y;;
        int temp=0;
         int n2;
        while(x!=0)
        {	
        	n2=x%10;
        	temp+=Math.pow(n2, 3);
        	x=x/10; 	
        }
        if(y==temp)
        {
        	System.out.println("amstrong number");
        }
        else
        {
        	System.out.println("not a amstrong number");
        }
	}
}
