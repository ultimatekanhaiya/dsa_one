

public class RowWiseSorting {
	public static void main(String[] args)
	{
		int[][] array2d = {{77,11,22,3},{11,89,1,2},{32,11,56,7},{11,22,44,33}};
		
		int [][] array2dnew = rowWiseSort(array2d);
		
		for(int i = 0; i < array2dnew.length; i ++)
		{
			for(int j = 0; j < array2dnew[i].length; j++)
			{
				System.out.print(array2dnew[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static int[][] rowWiseSort(int[][] array2d)
	{
		//loop for rows of matrix
		for(int i = 0; i < array2d.length; i ++)
		{
			//loop for column of matrix
			for(int j = 0; j < array2d[i].length; j++)
			{
				//loop for comparison and swapping
				for(int k = 0;  k < array2d[i].length -j -1; k++)
				{
					if(array2d[i][k] > array2d[i][k+1])
					{
						//swapping of elements
						int t = array2d[i][k];
						array2d[i][k] = array2d[i][k+1];
						array2d[i][k+1] = t;
					}
				}
			}
		}
		return array2d;
	}

}
