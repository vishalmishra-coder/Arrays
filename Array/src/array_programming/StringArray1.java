package array_programming;
import java.util.Arrays;
import java.util.Scanner;
public class StringArray1 {
	public static void main(String[] args) {
//		String[] a= {"mohan" , "sohan" , "rohan" , "john", "vicky" ,"john and rina"};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of String : ");
		int size = sc.nextInt();
		sc.nextLine();
		String [] s = new String[size];
		for(int i =0; i<=s.length-1; i++) {
			System.out.println("Enter the string elements :" + (i+1));
			s[i] = sc.nextLine();
		}
		
		System.out.println(Arrays.toString(s));
		
		stringArray(s);
		
	}
	public static void stringArray(String[] a) {
		System.out.print("Size of each element of string : ");
		for(String s : a) {
			System.out.print(s.length() + " ");
		}
	}

}
