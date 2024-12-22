package array_programming;

public class SmallestSecondSmallest {
	
	public static void main(String[] args) {
		int[] a= {5 ,5 ,8 ,7 , 6 ,9 ,5 };
		smallestSecond(a);
	}
	public static void smallestSecond(int [] a) {
		int small = a[0];
		int second_small = Integer.MAX_VALUE;
		for(int i=0; i<a.length; i++) {
			if(a[i] < small) {
				second_small = small;
				small = a[i];
			}
			else if(a[i] < second_small && a[i]!=small) {
				second_small = a[i];
			}
		}
		System.out.println("Smallest is : " + small);
		System.out.println("Second Smallest is : " + second_small);
	}

}
