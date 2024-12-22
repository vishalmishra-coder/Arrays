package array_programming;
import java.util.Arrays;
import java.util.Scanner;
public class StringArray4 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int size = sc.nextInt();
		sc.nextLine();
		String[] s = new String[size];
		for(int i=0; i<s.length; i++)
		{
			System.out.print("Enter the String " + (i+1) + ":" );
			s[i] = sc.nextLine();
		}
		String biggest = getBiggestString(s);
		System.out.println("Biggest String is : " + biggest);
//		System.out.println(Arrays.toString(s));   (To print array in readble format).
		
	}
	
	public static String getBiggestString(String[] s) {
		String big = "";
		for(String s1 : s) {
			if(s1.length() > big.length()) 
			{
				big = s1;
		
			}
		}
		return big;
		
		
	}
}
