package array_programming;
import java.util.Arrays;
import java.util.Scanner;
public class StrictlyIncreasing {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size : ");
		int size = sc.nextInt();
		int[] a = new int[size];
		for(int i=0; i<a.length; i++) {
			System.out.println("Enter the elemnet " + (i+1)+" : ");
			a[i] = sc.nextInt();
		}
//		System.out.println(Arrays.toString(a));
		if(checkStrictlyIncreasing(a))
			System.out.println("Strictly Increasing");
		else
			System.out.println("Not Strictly Increasing");
		sc.close();
		
	}
	
	public static boolean checkStrictlyIncreasing(int[] a) {
		for(int i=0; i<a.length-1; i++) {
			if(a[i+1]<a[i])
				return false;
		}
		return true;
	}
	

}
