/*source (Youtube-prepcoding)
 * 
 * SPIRAL MATRIX TRAVERSAL
 * 
 * 1.In this we have to use 4 for loops one for each side and one while loop covering all for loops
 * 2.We check the number of elements of array in while loop by increasing count value in every for loop so we can terminate
 * it if all elements are traversed.
 * 3.We take four variable for representing maxRowSize = arr.length-1, maxColumnSize = arr[0].length -1 , 
 * minRowSize = 0, minColumnSize = 0;
 * 4.NOTE: We can see that we only decrease/increase value assigned to j and reassigned that value to next for loop i
 * 
 * WE traverse from top->right->bottom->left
 */
package dsa;

public class SpiralMatrixTraversal {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		spiralTraversal(arr);

	}

	static void spiralTraversal(int[][] arr) {
		int maxr = arr.length - 1, maxc = arr[0].length - 1, minr = 0, minc = 0;

		int temp = arr.length * arr[0].length;
		int count = 0;

		while (count < temp) {
			// top wall
			for (int i = minc, j = minr; i <= maxc && count < temp; i++) {
				System.out.print(arr[j][i] + " ");
				count++;
			}
			minr++;

			// right wall
			for (int i = minr, j = maxc; i <= maxr && count < temp; i++) {
				System.out.print(arr[i][j] + " ");
				count++;
			}
			maxc--;

			// bottom wall
			for (int i = maxc, j = maxr; i >= minc && count < temp; i--) {
				System.out.print(arr[j][i] + " ");
				count++;
			}
			maxr--;

			// left wall
			for (int i = maxr, j = minc; i >= minr && count < temp; i--) {
				System.out.print(arr[i][j] + " ");
				count++;
			}
			minc++;
		}
	}

}
