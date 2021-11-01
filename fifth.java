package practice0111;
import java.util.*;
public class fifth {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		//factorial program
       int x=1;
       System.out.println("enter the factorial value");
       int fact=in.nextInt();
       for(int i=1;i<=fact;i++)
       {
    	    x=x*i;	  
       }System.out.println(x);
	}

}
