package durga_sir;

public class Pattern_printing3 {
public static void main(String[] args) {
	for(int i = 0; i < 5; i++)
	{
		for(int j = 4; j > i; j--)
		{
			System.out.print(" ");
		}
		for(int k = 0; k <= i; k++)
		{
			System.out.print("*");
		}
		System.out.println();
		
	}
	//OR
	/*          
	 int i, j;  
        for(i=0; i<n; i++) //outer loop for number of rows(n) { for(j=2*(n-i); j>=0; j--) // inner loop for spaces 
            {           
                System.out.print(" "); // printing space
            } 
            for(j=0; j<=i; j++) //  inner loop for columns
            {       
                System.out.print("* "); // print star
            }           
            System.out.println(); // ending line after each row
        } 
    } 
	*/
}
}
