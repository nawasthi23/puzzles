
package in.inishant.hacker.rank;

import java.util.Scanner;

/**
 * @author nishant.awasthi1
 *
 */
public class ArrayLeftRotation {

	/**
	 * 
	 */
	public ArrayLeftRotation() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int k = in.nextInt();
	        int a[] = new int[n];
	        for(int a_i=0; a_i < n; a_i++){
	            a[a_i] = in.nextInt();
	        }
	        int[] arr=rotateLeft(a,k);
	        for(int j=0;j<n; j++){
	        	System.out.print(arr[j]+" ");
	        }

	}

	private static int[] rotateLeft(int[] a, int numRotations) {
		int n=a.length;
		int[] arr=new int[n];
		int finalPos=0;
		 for(int j=0;j<n; j++){
			 int i=j-numRotations;
			 finalPos=i<0?n+i:i;
			 arr[finalPos]=a[j];
		 }
		return arr;
	}

}
