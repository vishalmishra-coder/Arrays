package array_programming;

public class LeftRotation {
	public static void main(String[] args) {
		int[] a = {10 ,15 , 12 , 18 , 20 ,17 ,19};
		System.out.println("Array before left rotation : ");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
//		rotateArray(a);
		rotateArrayKtimes(a , 2);
		System.out.println("\nArray after left rotation : ");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
	}
	
	public static void rotateArray(int[] a) {
		int n = a.length;
		int temp = a[0];
		for(int i=1; i<n; i++) {
			a[i-1] = a[i];
			
		}
		a[n-1] = temp;
	}
	
	public static void rotateArrayKtimes(int[] a , int k) {
		for(int i=1; i<=k; i++) {
			int n = a.length;
			int temp = a[0];
			for(int j =1; j<n; j++) {
				a[j-1] = a[j];
				
				
			}
			a[n-1] = temp;
		}
	}

}
