package array_programming;

public class PrintSum {
	public static void main(String[] args) {
		int[] a= {12, 23, 30, 12, 43, 55, 60, 43};
		System.out.println("Sum is : " +printSum(a));
		System.out.println("Sum of array is divisible by four is: " + divisibleByFour(a) );
	}
	
	
	public static int printSum(int[] a) {
		int sum =0;
		for(int p : a) {
			sum  = sum + p;
		}
		
		return sum;
	}
	
	public static int divisibleByFour(int[] a) {
		int sum =0;
		for(int s :a) {
			if(s%4==0)
			sum = sum + s;
		}
		return sum;
	}
	

}
