
import java.util.*;
public class SubArrayWithGivenSum {
	public static void main(String[] args) {
		int [] m = {1,2,3,7,5};
		int n = m.length;
		int s = 12;
		
ArrayList<Integer> al = new ArrayList<Integer>();
        
        int i = 0;
        int sum = m[0];
        for(int j = 1; j <=n;)
        {
          System.out.print(sum + "... ");
          if(sum == s)
          {
              al.add(i+1);
              al.add(j);
              break;
          }
          else if(sum < s && j<n)
          {
              sum += m[j];
              j++;
              System.out.println();
              
               System.out.print(j + " ");
          }
          else if(sum > s)
          {
              sum -= m[i];
              i++;
          }
          else {
        	  break;
          }
        	
        }
        if(al.isEmpty())
        {
            al.add(-1);
        }
        System.out.println(al);
	}

}
