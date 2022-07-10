/*
 * Source: geeksforgeeks
 * Complexity: time-> O(n)
 *             space-> O(1)
 * TOPIC- ReverseArrayInGroup
 * 
 * We are given a size 'k' and we have to take sub-array of that size and
 * reverse them.            
 * 
 * if sub-array size('k') > whole array size ('n') then perform max one whole array
 * rotation.
 */

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayInGroup {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.addAll(Arrays.asList(1, 2, 3, 4, 5));
		int k = 7;// size of sub-array
		System.out.println(reverseArray(al, k));
	}

	// 1st method my approach
	static void reverseArray1(ArrayList<Integer> al, int k) {
		int n = al.size();
		int i, j, l;
		if (k < n)// checking if sub-array size is not greater than original one
		{
			l = k;
			i = 0;
			j = l - 1;

			while (i < n - 1) {
				if (i < j) {
					int temp = al.get(i);
					al.set(i, al.get(j));
					al.set(j, temp);
					j--;
					i++;
				} else {
					i = l;
					l = (l + k > n ? l + (n - l) : l + k);
					j = l - 1;
					System.out.println(i + " " + l + " " + j);
				}

			}
		} else {
			i = 0;
			j = n - 1;
			while (i < j) {
				int temp = al.get(i);
				al.set(i, al.get(j));
				al.set(j, temp);
				j--;
				i++;
			}
		}

		System.out.println(al);
	}

	// 2nd method better than upper method source-GFG
	static ArrayList<Integer> reverseArray(ArrayList<Integer> al, int k) {
		for (int i = 0; i < al.size(); i = i + k) {
			int left = i;
			int right = Math.min(i + k - 1, al.size() - 1);
			while (left < right) {
				int temp = al.get(left);
				al.set(left, al.get(right));
				al.set(right, temp);
				left++;
				right--;
			}
		}
		return al;
	}

}
