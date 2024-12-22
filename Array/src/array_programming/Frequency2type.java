package array_programming;

public class Frequency2type {
	
	public static void main(String[] args) {
		int[] a = { 12 , 8 , 5 , 12 , 5 , 10 , 12 , 12};
//		System.out.println("===========1 ques========");
//		printFrequency(a);
//		System.out.println("===========2 ques========");
//		printFrequency2(a);
//		System.out.println("===========3 ques========");
//		printFrequency3(a);
//		System.out.println("===========4 ques========");
//		printFrequency4(a);
//		System.out.println("===========5 ques========");
//		printFrequency5(a);
//		System.out.println("===========6 ques========");
//		printFrequency6(a);
//		System.out.println("===========7 ques========");
//		printFrequency7(a);
		System.out.println("===========8 ques========");
		System.out.println("The first non repeating element : " +printFrequency8(a));

	}
	
	
//	print the frequency of each element in array(when range is not given).
	public static void printFrequency(int[] a) {
		int n = a.length;
		for(int i =0; i<n; i++) {
			int count = 1;
			for(int j =i+1; j<n; j++) {
				if(a[i]==a[j]) {
					count++;
					a[j]=a[n-1];
					n--;
					j--;
				}
			}
			System.out.println(a[i] + "is : " + count + "times");
			
		}
	}
	
	
//	print the element which is available only once in the array.
	public static void printFrequency2(int[] a) {
		int n = a.length;
		for(int i=0; i<n; i++) {
			int count =1; 
			for(int j=i+1; j<n; j++) {
				if(a[i] == a[j]) {
					count++;
					a[j] = a[n-1];
					n--;
					j--;
				}
				
			}
			if(count==1) {
				System.out.println(a[i] + " is : => " + count + " times");
			}
		}
	}
	
	
//	print all the elements which appeared more than once.
	public static void printFrequency3(int[] a) {
		int n = a.length;
		for(int i=0; i<n; i++) {
			int count=1;
			for(int j =i+1; j<n; j++) {
				if(a[i] == a[j]) {
					count++;
					a[j] = a[n-1];
					n--;  j--;
				}
			}
			if(count>1) {
				System.out.println(a[i] + " is : => " + count + " times");
			}
			
		}
	}
	
	
//	print all the elements at least once.
	public static void printFrequency4(int[] a) {
		int n = a.length;
		for(int i=0; i<n; i++) {
			int count =1;
			for(int j = i+1; j<n; j++) {
				if(a[i]==a[j]) {
					count++;
					a[j] = a[n-1];
					n--; j--;
				}
			}
			if(count>0) {
				System.out.println(a[i] + " is: => " + count + " times");
			}
		}
	}
	
	
	
//	print all the elements which has aappeared only even times in array.
	public static void printFrequency5(int[] a) {
		int n = a.length;
		for(int i=0; i<n; i++) {
			int count=1;
			for(int j= i+1; j<n; j++) {
				if(a[i] == a[j]) {
					count++;
					a[j] = a[n-1];
					n--; 
					j--;
				}
			}
			if(count%2==0) {
				System.out.println(a[i] + " is : => " + count + " times");
			}
		}
	}
	
	
//	print all the elements which has appeared in odd no of times in array
	public static void printFrequency6(int[] a) {
		int n = a.length;
		for(int i=0; i<n; i++) {
			int count=1;
			for(int j=i+1; j<n; j++) {
				if(a[i] == a[j]) {
					count++;
					a[j] = a[n-1];
					n--;
					j--;
				}
			}
			if(count%2==1) {
				System.out.println(a[i] + " is:=> " + count +" times");
			}
		}
	}
	
	
	
//	print all the element which has appeared for the maximum times in the array.
	public static void printFrequency7(int[] a) {
		int n = a.length;
		int max =0;
		int elem = a[0];
		for(int i=0; i<n; i++) {
			int count=1; 
			for(int j= i+1; j<n; j++) {
				if(a[i] == a[j]) {
					count++;
					a[j]=a[n-1];
					n--;
					j--;
				}
			}
			if(count>max) {
				max = count;
				elem = a[i];
			}
			
			}
		System.out.println("The element with maximum frequency is : " + elem);
	}
		
	
//	print the element and its index which is first non repeating element.
	public static String printFrequency8(int[] a) {
		int n = a.length;
		for(int i=0; i<n; i++) {
			int count=1; 
			for(int j= i+1; j<n; j++) {
				if(a[i] == a[j]) {
					count++;
					a[j]=a[n-1];
					n--;
					j--;
				}
			}
			if(count==1) {
				return (a[i] +" at index "+ i);
			}
	
		}
		return null;
		}

}
