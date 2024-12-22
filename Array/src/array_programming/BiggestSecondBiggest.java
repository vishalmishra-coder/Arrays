package array_programming;

public class BiggestSecondBiggest {
	public static void main(String[] args) {
		int[] a = { 17 ,17 ,15 ,14 , 10 ,16 , 17};
		biggestSecondBiggest(a);
		
	}
	
	public static void biggestSecondBiggest(int[] a) {
		int big = a[0];
		int second_big = Integer.MIN_VALUE;
		for(int i=0; i<a.length; i++) {
			if(a[i] > big) {
				second_big = big;
				big = a[i];
			}
			else if(a[i] > second_big && a[i]!=big) {
				second_big=a[i];
			}
		}
		
		System.out.println("Biggest is : " + big);
		System.out.println("Second Biggest is : " + second_big);
		
		
	}

}
