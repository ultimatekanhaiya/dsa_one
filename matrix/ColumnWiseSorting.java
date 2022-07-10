
import java.util.*;
public class ColumnWiseSorting {
	public static void main(String[] args) {
		int [][] array = {{5,4},{7,5},{2,3},{11,1},{11,2}};
		Arrays.sort(array,new Comparator<int[]>() {
			public int compare(int[] a,int[] b) {
				return Integer.compare(a[0], b[0]);
			}
		});
		
		for(int i = 0; i < array.length; i++)
		{
			System.out.print(array[i][1] + " ");
		}
	}
}