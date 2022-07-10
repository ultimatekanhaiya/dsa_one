public class PalindromicPartition {
	public static void main(String[] args) {
		String s = "racecar";
		
		String[] k = palindromicPartition(s);
		for(String i:k)
		{
			//System.out.println(i);
		}
		//System.out.println(s);
	}
	
	public static String[] palindromicPartition(String s)
	{
		int n = s.length();
		int sum = n*(n+1)/2;
		int y = 0;
		String[] sarr = new String[sum]; 
		
		for(int i = 0; i < s.length(); i++)
		{
			String k = "";
			for(int j = i ; j < s.length(); j++)
			{
				k+=Character.toString(s.charAt(j));
				if(y < sum)
				{
					sarr[y] = k;
					y++;
				}				
			}
		}
		
		for(int i = 0; i < sum; i++)
		{
			if(sarr[i].charAt(0) == sarr[i].charAt(sarr[i].length()-1))
			{
				if(sarr[i].length() > 3)
				{
					if(new StringBuffer(sarr[i]).reverse().toString().equals(sarr[i]))
					{
						System.out.print(sarr[i] + " ");
					}
				}
				else
				{
					System.out.print(sarr[i] + " ");
				}
			}
		}
		
		return sarr;
	}

}
