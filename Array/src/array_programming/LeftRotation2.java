package array_programming;

public class LeftRotation2 {
	
	public static void main(String[] args) {
		int[] a = {10 ,15 ,12 ,18 ,20 , 17 ,19};
		System.out.println("Array elements are: ");
		for(int x:a)
			System.out.print(x + " ");
		int k =10;
		k = k%a.length;
		reverseArray(a, 0, a.length-1);
		reverseArray(a , 0 , a.length-k-1);
		reverseArray(a , a.length-k , a.length-1);
		System.out.println("\nArray elements after rotation are: ");
		for(int y:a)
			System.out.print(y + " ");
		
	}
	
	public static void reverseArray(int[] a , int start , int end) {
		while(start<end) {
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
	}

}
