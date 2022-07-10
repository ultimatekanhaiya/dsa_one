

public class Segregate_0_1_Positive_Negative {
	public static void main(String[] args) {
		int [] arr = {0,-10,1,3,-20};
		arr = segregate_positive_negative(arr);
		for(int k : arr)
		{
			System.out.print(k + " ");
		}
	}
	
	static int [] segregate_0_1(int [] arr)
	{
		
		return arr;
	}
	
	static int [] segregate_positive_negative(int [] arr)
	{
		int j = arr.length-1;
		int i = 0;
		while(i != j)
		{
			if(arr[i] <= 0)
			{
				if(arr[j] <= 0)
				{
					j--;
				}
				else
				{
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
					i++;
				}
			}
			else if(arr[i] > 0)
			{
				i++;
			}
		}
		return arr;
	}

}
