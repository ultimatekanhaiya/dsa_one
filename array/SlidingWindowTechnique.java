
public class SlidingWindowTechnique {
	public static void main(String[] args) {
		int k = 4;
		int [] arr = {1, 4, 2, 10, 23, 3, 1, 0, 20};
		System.out.println(maximumsum(arr,k));
	}
	
	static int maximumsum(int [] arr,int k )
	{
		int windowSum = 0;
		for(int i = 0; i < k; i++)
		{
			windowSum += arr[i];
		}
	
		int max = windowSum;
		int l  = 0;
		
		for(int i = k; i < arr.length; i++)
		{			
			windowSum = windowSum - arr[l] + arr[i];
			if(max < windowSum)
			{
				max = windowSum;
			}
			l++;
		}
		return max;
	}

}
