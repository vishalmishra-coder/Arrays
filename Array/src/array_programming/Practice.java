package array_programming;
import java.util.Arrays;
import java.util.Scanner;
public class Practice 
{
	public static void main(String[] args) {
		int [] a = {19 , 0 , 21 , 0 , 20 , 0};
		reverse(a);
		for(int x: a) {
			System.out.print(x + " ");
		}
	}
	
	public static void reverse(int[] a) {
		for(int i=0,j=0;  i<a.length; i++) {
			if(a[i]!=0) {
				a[j]=a[i];
				if(i!=j) {
					a[i] =0;
				} 
				j++;
				
			}
		}		
	}	
}
