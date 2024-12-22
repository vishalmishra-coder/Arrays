package array_programming;

public class Program1 {
	
//	Q =Print the elements of an array(Array has length variable and String has length()method).
	public static void main(String[] args) {
		int [] a= {12 , 23 , 30};
		double[] b= {20.3 , 12.9, 2039.9};
		
		String[] c= {"mohan" , "sohan" , "20"};
		
		System.out.println(a.length);
		System.out.println(b);
		System.out.println("Lenght of Array is : " + c.length);
		System.out.println("Length of String is: " + c[0].length());
		
	}

}
