package array_programming;

public class Biggest {
	public static void main(String[] args) {
		int[] a = {12 , 24 ,30 , 12 , 45 , 55 , 60 , 43};
		int big = biggest(a);
		System.out.println("Biggest Number in an array is : " + big);
		
		System.out.println("Difference of biggest and smallest is : " + biggestSmallest(a));
		}
	
	public static int biggest(int[] a) {
		int biggest = a[0];
		for(int p: a) {
			if(p>biggest) {
				biggest = p;
			}
			
		}
		return biggest;
	}
	
	
	public static int biggestSmallest(int[] a) {
		int biggest=a[0];
		int smallest=a[0];
		for(int p:a) {
			if(p>biggest) {
				biggest = p;
			}
			if(p<smallest) {
				smallest = p;
			}
		}
		return biggest-smallest;
	}
	

}
