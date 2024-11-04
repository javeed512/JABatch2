package instanceOf;

public class InstanceOf16 {
	
	
		public static void main(String[] args) {
			
			
			//Object o = new String("hello");
			
			Object o = new Integer(99);
			
			if (o instanceof String s) 
			{
			    System.out.println( String.format("String %s", s) );
			} 
			else if (o instanceof Integer i) 
			{
				 System.out.println( String.format("int %d", i) );
			} 
			else if (o instanceof Double d) 
			{
				 System.out.println(  String.format("double %f", d) );
			}
			
			
		}
	

}
