package array_programming;
// Q = Print all the even elements in array.
public class PrintEven {
	public static void main(String[] args) {
		int[] a = {12 , 23 , 30 , 12 , 43 , 55 , 60 , 43};
		printEven(a);
		printEvenIndexElement(a);
	}
	public static void printEven(int[] a) {
		System.out.print("All Even Elements are : ");
		for(int p : a) {
			if(p%2==0) {
				System.out.print(p + " ");
				
			}
		}
		
	}
//	Q = Print all the evenindex elements in array.
	public static void printEvenIndexElement(int[] a) {
		System.out.print("\nEven Index of array element : ");
		for(int i=0; i<a.length; i++) {
			if(i%2==0) {
				System.out.print(a[i] + " ");
			}
		}
	}

}
