package strings_api;

public class ImmutableDemo {

	public static void main(String[] args) {

		
		String s1 = "hello";
		
		
		s1 = s1 + "world";
		
		s1 =  s1.concat("again");
		
		String str = new String("hello");
		
		StringBuffer sb1 = new StringBuffer(str);// synchronous
		
		// StringBuilder  is asynchronous , it is used for multi threading
		
				System.out.println(sb1);
		
		
		  sb1.append("world");
		  
		    	sb1.delete(0, 2);
		  
		  System.out.println(sb1);
		  
		  	System.out.println(sb1.reverse());

	}

}
