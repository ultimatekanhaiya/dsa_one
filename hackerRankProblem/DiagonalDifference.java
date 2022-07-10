//IMPORTANT QUESTION
/*
 * This problem teaches us how to use 2D collections 
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class DiagonalDifference {
public static void main(String[] args) {
	int [][] arr = {{1,2,3,},{4,5,6},{9,8,9}};
	int difference =diagonalDifference(arr);
	System.out.println(difference);
	/*Declaring 2D ArrayList*/
	List<List<Integer>> al = new ArrayList<>();
/*
*1. Cant's use ArrayList<ArrayList<Integer> al = new ArrayList<ArrayList<Integer>()
* because function need 'List' not 'ArrayList'
* 2.Can't use List<List<Integer>> al = new ArrayList<ArrayList<Integer>();
* because cannot convert from ArrayList<ArrayList<Integer>> to List<List<Integer>>
* OR
* 3.Can't use List<List<Integer>> al = new ArrayList<Integer>();
*because cannot convert from ArrayList<Integer> to List<List<Integer>>
*
*4.we can add elements in 2D Collection by two ways
*
*4.1 al.add(new ArrayList<Integer>()); ->one space allocated for 0th row
*    then l.get(0).add(0,3); ->Adding 3 to 0th row created above x(0, 0)
*
*4.2 al.add(new ArrayList<Integer>(Arrays.asList(1,2,3))); ->
*    Creating 1st row and adding values.
*    
*5.Using Math.abs()  method to get absolute(positive) values only.  
*/ 
	al.add(new ArrayList<Integer>(Arrays.asList(1,2,3)));
	al.add(new ArrayList<Integer>(Arrays.asList(4,5,6)));
	al.add(new ArrayList<Integer>(Arrays.asList(9,8,9)));
	System.out.println(al);
	int differ = diagonalDifference(al);
	System.out.println(differ);
}
static int diagonalDifference(int [][] arr)
{
	int difference = 0;
	int right = 0;
	int left = 0;
	for(int i = 0; i < arr.length; i++)
	{
		for(int j = 0; j < arr.length; j++)
		{
			if(i == j)
			{
				right+=arr[i][j];
			}
			if(i+j == arr.length-1)
			{
				left += arr[i][j];
			}
		}
	}
	difference = Math.abs(left - right);
	return difference;
}
static int diagonalDifference(List<List<Integer>> arr)
{
	int difference = 0;
	int right = 0;
	int left = 0;
	for(int i = 0; i < arr.size(); i++)
	{
		for(int j = 0; j < arr.size(); j++)
		{
			if(i == j)
			{
				right+= arr.get(i).get(j);
			}
			if(i+j == arr.size()-1)
			{
				left += arr.get(i).get(j);
			}
		}
	}
	difference = Math.abs(left - right);
	return difference;
}


}
