package inheritance;

public class Test {

	public static void main(String[] args) {


		//Person person1 = new Person();  // ---> Object();
		
		//System.out.println(person1);  // toString()
		
		Person person1 = new Person("javeed", "trainer");
		// validate();
		  person1.walk();
		  person1.learn();
		  
		  System.out.println(person1.toString());
		  //System.out.println(person1.hashCode());
		  
		  
		  
		  Programmer programmer = new Programmer();
		  
		  		programmer.setName("James");
		  		programmer.setDesignation("Developer");
		  		programmer.setCompanyName("Hexaware");
		  
		  System.out.println(programmer.toString());
		  
		  
		  		programmer.learn();
		  
		  

	}

}
