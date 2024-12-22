package array_programming;

public class Frequency {
	public static void main(String[] args) {
		int[] a= {12 , 15 , 12 , 18 , 20 , 12 , 15 , 12};
		System.out.println("==========1 ques=============");
		frequency(a);
		System.out.println("==========2 ques=============");
		frequency2(a);
		System.out.println("==========3 ques=============");
		frequency3(a);
		System.out.println("==========4 ques=============");
		frequency4(a);
		System.out.println("==========5 ques=============");
		frequency5(a);
		System.out.println("==========6 ques=============");
		frequency6(a);
		System.out.println("==========7 ques=============");
		frequency7(a);
		System.out.println("==========8 ques=============");
		System.out.println(frequency8(a));
	}
	
	
//	Print the frequency of each array element. (when range is not given);
	public static void frequency(int[] a)
	{
		int[] freq = new int[101];
		for(int i=0; i<a.length; i++) 
		{
			freq[a[i]]++;
		}
		
		for(int i=0; i<freq.length; i++) 
		{
			if(freq[i]>0)
			System.out.println(i + " is :==> " + freq[i] + "times");
		}
		
		}
	
	
	
//	print the frequency of element which is available only once in the array.
	public static void frequency2(int[] a)
	{
		int[] freq = new int[101];
		for(int i=0; i<a.length; i++) 
		{
			freq[a[i]]++;
		}
		
		for(int i=0; i<freq.length; i++) 
		{
			if(freq[i]==1)
			System.out.println(i + " is :==> " + freq[i] + "times");
		}
		
		}
	
	
	
//	print the element which has appeared more than once.
	public static void frequency3(int[] a) {
		int[] freq = new int[101];
		for(int i=0; i<a.length; i++) {
			freq[a[i]]++;
		}
		for(int i=0; i<freq.length; i++) {
			if(freq[i]>1)
				System.out.println(i + " is :=>>" + freq[i] + " times");
		}
		
	}
	
	
	
//	print all the element which as appeared at least once.
	public static void frequency4(int[] a) {
		int[] freq = new int[101];
		for(int i=0; i<a.length; i++) {
			freq[a[i]]++;
		}
		
		for(int i=0; i<freq.length; i++) {
			if(freq[i]>0)
				System.out.println(i + " is: => " + freq[i] + "times");
		}
	}
	
	
//	print all the elements which has appeared even times in the array.
	public static void frequency5(int[] a) {
		int[] freq = new int[101];
		for(int i=0; i<a.length; i++) {
			freq[a[i]]++;
		}
		for(int i=0; i<freq.length; i++) {
			if(freq[i]>0 && freq[i] %2==0)
				System.out.println(i + " is : => " + freq[i] + "times");
		}
	}
	
	
	
//	print all the elements which has appeared odd times in the array.
	public static void frequency6(int[] a) {
		int[] freq = new int[101];
		for(int i=0; i<a.length; i++) {
			freq[a[i]]++;
		}
		for(int i=0; i<freq.length; i++) {
			if(freq[i]%2==1)
				System.out.println(i + " is : =>>" + freq[i] + "times");
		}
	}
	
	
//	print all the elements which has appeared for the maximum times in the array.
	public static void frequency7(int[] a) {
		int max =0;
		int[] freq = new int[101];
		for(int i=0; i<a.length; i++) {
			freq[a[i]]++;
		}
		for(int i=0; i<freq.length; i++) {
			if(freq[i]>max) {
				max = freq[i];
				System.out.println(i + " is maximum :=> " + max + "times");
			}
		}
	}
	
	
	
//	print the element and its index which is the first non-repeating element.
	public static String frequency8(int[] a) {
		int[] freq = new int[101];
		for(int i=0; i<a.length; i++) {
			freq[a[i]]++;
			
		}
		for(int i=0; i<freq.length; i++) {
			if(freq[a[i]]==1) {
				return (a[i] + " at index " + i);
				
			}
		}
		return null;
	}

}
