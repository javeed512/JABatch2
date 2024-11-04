package functional_interface;

public class Test {

	public static void main(String[] args) {
		
		
			MyInterface mi =	(int a,int b)->{ return a+b;}; // implementation or lambda expression
		
					int result =	mi.add(5, 4);
					
					System.out.println(result);
					
					
					MyInterface.m1();
					
					mi.m2();
			
	}

}
