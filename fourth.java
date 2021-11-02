package practice0211;
import java.util.*;
class blue
{
	Scanner in = new Scanner(System.in);
	blue()
	{
	System.out.println("check three float values ,which is bigger one");
	System.out.println("enter three float values ");
	float f1 = in.nextFloat();
	float f2 =in.nextFloat();
	float f3 =in.nextFloat();
	String check1 =((f1>f2)&&(f1>f3))?"f1 is bigger one":(f2>f3)?"f2 is bigger one":"f3 is bigger one";
	System.out.println(check1);
	}
}
public class fourth {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        blue obj = new blue();
	}

}
