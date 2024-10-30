package strings_api;

public class Demo {

	public static void main(String[] args) {


		String s1 = "hello";
		
		String s2 = "hello";
		
		
		
		
		System.out.println("Values are same : "+  s1.equals(s2));
		
		
		System.out.println("compare references "+  (s1 == s2));
		
		System.out.println( 5 == 9 ); // it compare primitive int values
		
		
		String  s3 = new String("javeed");
		
		String  s4 = new String("javeed");
		
		System.out.println("s3 and s4 values "+  s3.equals(s4));
		
		System.out.println("s3 and s4 hashcode "+  (s3 == s4) );
		
		
		  

	}

}
