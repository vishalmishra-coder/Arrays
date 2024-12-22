package array_programming;

public class CheckEven {
	
	public static void main(String[] args) 
	{
		int[] a = {12 , 16 , 18 , 22 , 80};
		if(checkEven(a))
			System.out.println(" Even Number ");
		else
			System.out.println(" Odd Number ");
		
		
		
		if(checkEvenProduct(a))
			System.out.println("Product of all elements is even");
		else
			System.out.println("Product of all elements is odd");
	}
	
	public static boolean checkEven(int[] a) {
		for(int p:a) {
			if(p%2==1) {
				return false;
			}
		}
		return true;
	}
	
	
	public static boolean checkEvenProduct(int[] a) {
		for(int p : a) {
			if(p%2==1) {
				return false;
			}
		}
		return true;
	}

}
