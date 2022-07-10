package durga_sir;

public class Pattern_printing10 {
	public static void main(String[] args) {
		int p = 2;
		int l = 6;
		for(int i = 0; i < 4; i++)
		{
			if(i>0)
			{
				for(int k = p; k > 1; k--)
				{
					System.out.print(k);
				}
				p++;
			}
			
			for(int j = 1; j < l; j++)
			{
				System.out.print(j);				
			}
			l--;
			
			System.out.println();
			
		}
		System.out.print(51234);
	}

}
