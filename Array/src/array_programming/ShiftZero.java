package array_programming;

public class ShiftZero {
	public static void main(String[] args) {
		int[] a = {8 ,0 ,2, 6, 0, 4};
		System.out.println("Array elements are : ");
		for(int i =0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		shiftZero(a);
		System.out.println("\nArray elements after shifting zero : ");
		for(int i =0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
	}
	
	public static void shiftZero(int[] a)
	{
		for(int i=0,j=0; i<a.length; i++) {
			if(a[i]!=0) {
				a[j] = a[i];
				
				if(i!=j) {
					a[i] = 0; 
				}
				j++;
			}
		}
	}

}
