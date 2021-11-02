package practice0211;
import java.util.*;
class kakhi
{
	String color;
	Scanner in = new Scanner(System.in);
	 public void kakhi1()
	 {
	   System.out.println("enter first letter of vibgyor to find a color");
       color=in.nextLine();
       colorcheck();
	 }
       public void colorcheck()
       {
       	switch(color)
       	{
       	case "v":
       	{
       		System.out.println("this is violet");
       		break;
       	}
       	case "i":
       	{
       		System.out.println("this is indigo");
       		break;
       	}
       	case "b":
       	{
       		System.out.println("this is blue");
       		break;
       	}
       	case "g":
       	{
       		System.out.println("this is green");
       		break;
       	}
       	case "y":
       	{
       		System.out.println("this is yellow");
       		break;
       	}
       	case "o":
       	{
       		System.out.println("this is orange");
       		break;
       	}
       	case "r":
       	{
       		System.out.println("this is red");
       		break;
       	}
       	default:
       	{
       		System.out.println("please select color from vibgyor");
       		kakhi1();
       	}
       	
       		
       	}
	 }
}

public class sixth {
	public static void main(String[] args)
	{
      kakhi obj = new kakhi();
      obj.kakhi1();
	}
}
