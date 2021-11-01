package practice0111;
class red
{
	red()
	{int i;
		int[] x= {0,10,20,30,40};
		int[] y=new int[5];
		for(i=0;i<x.length;i++)
		{
			y[i]=x[i]+x[i];	
		}
		for(Integer k:y)
		{
			System.out.println(k);
		}
	}
}


public class eigth 
{
	public static void main(String[] args)
	{
        red obj = new red();
	}
}
