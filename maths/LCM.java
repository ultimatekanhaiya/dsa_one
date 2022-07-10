package revision;

import java.util.*;

public class LCM {
	public static void main(String[] args) {
		List<Integer> a = new ArrayList<Integer>(Arrays.asList(2,4));
		List<Integer> b = new ArrayList<Integer>(Arrays.asList(16,32,96));
		int lcm = lcm(a);
		int gcd = gcd(b);
		//System.out.println("lcm is " + lcm);
		//System.out.println("gcd is " + gcd);
		
		int count = 0;
		for(int i = lcm, j = 2; i <= gcd; i=lcm*j,j++)
		{
			if(gcd%i == 0)
			{
				count++;
			}
		}
		System.out.println(count);
	}
	
	//GCD code
	public static int gcd(List<Integer> a)
	{
		int gcd = a.get(0);
		for(int i = 1; i < a.size(); i++)
		{
			gcd = findgcd(a.get(i), gcd);
		}
		return gcd;
	}
	
	public static int findgcd(int a, int b)
	{
		if(a == 0)
		{
			return b;
		}
		else
		{
			return findgcd(b%a,a);
		}
	}
	
	//LCM code
	public static int lcm(List<Integer> a)
	{
		int lcm = a.get(0);
		for(int i = 1; i < a.size(); i++)
		{
			lcm = findlcm(a.get(i),lcm);
		}
		return lcm;
	}
	
	public static int findlcm(int a, int b)
	{		
		return (a*b)/findgcd(a,b);		
	}

}
