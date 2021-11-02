package practice0211;
import java.util.*;
class green
{
	//using array which one is bigger
	green()
	{
      int[] x= {10,20,30,40,50};
      int max=x[0];
      for(int i=0;i<x.length;i++)
      {
    		if(max<x[i])
    		{
    			max=x[i];
    		}
    	}
      System.out.println("the maximum value is "+max);
	}
}
public class fifth {

	public static void main(String[] args)
	{
         green obj = new green();
	}

}
