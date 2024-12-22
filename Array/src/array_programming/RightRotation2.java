package array_programming;

public class RightRotation2 {
	public static void main(String[] args) {
		int[] a = { 10,15,12,18,20,17,19};
		System.out.println("Array elements before rotation : ");
		for(int x : a) {
			System.out.print(x + " ");
		}
		int  k = 3;
		 k = k%a.length;
		reverseArray(a , 0 , a.length-1);
		reverseArray(a ,0 , k-1);
		reverseArray(a, k , a.length-1);
		System.out.println("\nArray elements after rotation : ");
		for(int x : a) {
			System.out.print(x + " ");
		}
		
	}
//	Right Rotation without using nested loop.
	public static void reverseArray(int[] a, int start , int end) {
		while(start < end) {
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
			
		}
	}

}
