package array_programming;
import java.util.Arrays;
import java.util.Scanner;
public class RemoveElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int size = sc.nextInt();
		int[] a = new int[size];
		for(int i=0; i<a.length; i++) {
			System.out.println("Enter the elements " + (i+1)+ ":");
			a[i] = sc.nextInt();
		}
		System.out.println("All Array element are :");
		for(int x :a) {
			System.out.print(x + " ");
		}
//		System.out.println(Arrays.toString(a));
		System.out.println("\nEnter the index which we want to remove : ");
		int index = sc.nextInt();
		try {
			if(index<0 || index>a.length) 
				throw new IndexOutOfBoundsException("The given index is out of range");
			int[] b=removeElement(a , index);
			System.out.println("New array element are : ");
			for(int y: b) 
				System.out.print(y + " ");
			
//		System.out.println(Arrays.toString(b));
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
		finally {
			sc.close();
		}
		System.out.println("\n=========Program ends Successfully========");
	
	
		
		
	}
	
	public static int[] removeElement(int[] a , int index) {
		int[] b = new int[a.length -1];
		for(int i=0; i<b.length; i++) {
			if(i<index) {
				b[i] = a[i];
			}
			else {
				b[i] = a[i + 1];
			}
		}
		return b;
	}
	

}
