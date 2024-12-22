package array_programming;
import java.util.Arrays;
import java.util.Scanner;
public class AddElement {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size : ");
	int size = sc.nextInt();
	int[] a = new int[size];
	for(int i =0; i<a.length; i++) {
		System.out.println("Enter the elements  " + (i+1) + " :");
		a[i] = sc.nextInt();
	}
	System.out.println("all elements of array are : ");
	for(int x:a)
		System.out.print(x + " ");
//	System.out.println(Arrays.toString(a));
	System.out.println("\nEnter the index we want to add : ");
	int index = sc.nextInt();
	System.out.println("Enter the value we want to add : ");
	int value = sc.nextInt();
	int[] b = addElement(a ,index ,value);
	System.out.println("New updated elements are : ");
	for(int y:b)
		System.out.print(y + " ");
//	System.out.println(Arrays.toString(b));
	System.out.println("\n=====Program ends===========");
	}
	
	public static int[] addElement(int[] a , int index , int value) {
		int[] b = new int[a.length+1];
		for(int i=0; i<b.length; i++) {
			if(i<index) {
				b[i] = a[i];
			}
			else if(i==index) {
				b[i] = value;
			}
			else {
				b[i] = a[i-1];
			}
		}
		return b;
	}
	

}
