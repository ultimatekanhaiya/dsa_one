package durga_sir;

public class Pattern_printing9 {
public static void main(String[] args) {
	System.out.println("0*");
	for(int l = 9; l > 0 ; l--)
	{
		for(int m = l; m < 10 ; m++)
		{
			System.out.print(m);
		}
		System.out.print("0");
		
		for(int m = 9; m >= l ; m--)
		{
			System.out.print(m);
		}
		if(l % 2 == 0 )
		{
		System.out.print("*");
		}
		else
		{
			System.out.print("**");
		}
		System.out.println();
	}
}
}
