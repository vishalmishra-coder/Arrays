package array_programming;

public class StringArray2 {
	public static void main(String[] args) {
		
		String[] a = {"Salman" , "Vijay" , "Thala" , "ambitabh" , "Sharukh" , "gopi" };
		try {
			
			arrayString(a);
		}
		catch(Exception e) {
			
		}
	}
	public static void arrayString(String[] a) throws Exception{
		int count=0;
		for(String s1 :a) {
			if(s1.length()%2==0) {
				count++;
				System.out.println(s1);
				Thread.sleep(700);
			}
		}
		System.out.println("Count of Even length String is : " + count);
	}

	

}
