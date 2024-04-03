public class Pattern_printing7 {
public static void main(String[] args) {
	for(int i = 0; i < 5; i++)
	{
		for(int j = 0; j <= i; j++)
		{
			System.out.print("*");
		}
		for(int k = 4; k > i; k--)
		{
			System.out.print(" ");
		}
		for(int l = 3; l > i; l--)
		{
			System.out.print(" ");
		}
		for(int m = 0; m <= i; m++)
		{
			if(i<4)
			{
			System.out.print("*");
			}
			if(m == 4)
			{
				System.out.print("****");
			}
	}
	System.out.println();
	}

	for(int i = 0; i < 5; i++)
	{
		for(int j = 4; j > i; j--)
		{
			System.out.print("*");
		}
		for(int k = 1; k <= i; k++)
		{
			if(k < 4) 
			{
			System.out.print(" ");
			}
		}
		for(int l = 0; l <= i; l++)
		{
			if(l < 4) 
			{
			System.out.print(" ");
			}
		}
		for(int m = 4; m > i; m--)
		{
			System.out.print("*");
		}
	System.out.println();
	}
}
}
