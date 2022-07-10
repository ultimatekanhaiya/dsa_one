package revision;
import java.util.Scanner;
public class LeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter year to find its leap or not");
		String year = sc.next();
		System.out.println(leap(year));
	}
	
	public static String leap(String year)
	{
		String s = "NO";
		int n = Integer.parseInt(year.substring(year.length()-2));
		//System.out.println(n);
		if(n == 0)
		{
			int k = Integer.parseInt(year)%400;
		//	System.out.println(k);
			if(k == 0)
			{
				return "YES";
			}
			else
				return "NO";
		}
		else if(n != 0) 
		{
			int k = n%4;
			if(k == 0)
			{
				return "YES";
			}
			else
			{
				return "NO";
			}
		}
		return "YES";
	}

}
