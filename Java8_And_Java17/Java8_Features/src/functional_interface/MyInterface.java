package functional_interface;

@FunctionalInterface
public interface MyInterface {
	
	
	
		public abstract  int add(int a, int b);
		
		//public void  setName(String name);
		
		//public int  findLength();
		
		// public boolean  isValid(String data);
		
		
		
		
		
		
		public static void m1() {
			
			
			System.out.println("static method");
		}
		
		public default void m2() {
			
			System.out.println("default method");
			
		}
		

}
