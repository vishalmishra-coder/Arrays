package array_programming;

import java.util.Arrays;

public class RightRotation {
	public static void main(String[] args) {
		int[] a= {10 , 15 , 12 , 18 , 20 , 17 , 19};
//		System.out.println("Array before rotation : " + Arrays.toString(a));
		System.out.println("Array before rotation : ");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
//		rotateArray(a);
		rotateArrayKtimes(a,2);
		System.out.println("\nArray after rotation : ");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
//		System.out.println("Array after rotation : " + Arrays.toString(a));
		
		
	}
	
	public static void rotateArray(int[] a) {
		int n = a.length;
		int temp = a[n-1];
		for(int i = n-2; i>=0; i--) {
			a[i+1] = a[i];
		}
		a[0] = temp;
		
	}
	
	public static void rotateArrayKtimes(int[] a, int k) {
		for(int i=1; i<=k; i++) {
			int n = a.length;
			int temp = a[n-1];
			for(int j = n-2; j>=0; j--) {
				a[j+1] = a[j];
				
			}
			a[0]= temp;
		}
	}
	

}


