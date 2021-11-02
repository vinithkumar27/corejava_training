package practice0211;
import java.util.*;
public class eigth {
     static Scanner in = new Scanner(System.in);
	public static void main(String[] args) 
	{
       System.out.println("get the number to add a digit values");
       int x=in.nextInt();
       int num1=x;
       String num=String.valueOf(x);
       int value=0;
       int digit=0;
       for(int i=0;i<=num.length();i++)
       {
    	   digit=x%10;
    	   value=(int)(value+Math.pow(digit,num.length()));
    	   x=x/10;
       }
       System.out.println(num1==value);
	}

}
