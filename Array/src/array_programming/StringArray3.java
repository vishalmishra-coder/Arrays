package array_programming;

public class StringArray3 {
	public static void main(String[] args) {
		String[] s = {"Mohan" , "Pankaj" , "Suman" , "Rajat" , "Mohit", "Jay" , "rohi and jay"};
		String biggest = arrayString(s);
		System.out.println("Biggest String is : " + biggest);
	}
	public static String arrayString(String[] s) {
//		String big = s[0];
		String big = "";
		for(String s1 :s) {
			if(s1.length() > s[0].length()) {
				big = s1;
				}
		}
		return big;
	}
	

}
