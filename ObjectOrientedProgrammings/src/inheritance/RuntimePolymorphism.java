package inheritance;

public class RuntimePolymorphism {

	public static void main(String[] args) {


		
			//Object obj = new Object();
			
			//Person person = new Person();
			
			//Programmer prg  = new Programmer();
		
		// Runtime polymorphism
				Object obj  = new Person();  //  new Programmer();
				
				Person person  =  new Programmer();
			
				
				String s = new String("hello");
				
				Integer i = new Integer(44);
			
				String s2 =  i.toString();
			System.out.println(s2);

					String str = "1000";
					
					int n =	Integer.parseInt(str);
						
					double d =	Double.parseDouble(str);
						
						long l = Long.parseLong(str);
					
					
					
			
			
	}

}
