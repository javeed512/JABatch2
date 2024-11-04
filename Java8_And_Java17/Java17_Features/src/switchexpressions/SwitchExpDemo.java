package switchexpressions;

import java.util.ArrayList;
import java.util.Collection;

public class SwitchExpDemo {

	public static void main(String[] args) {

		System.out.println(getDayOfWeek(9));
		
		  System.out.println("Is valid user : "+ validate("spiderman", "web", "customer"));
			

	}

	public static String getDayOfWeek(int day) {

		return switch (day) { // switch exp java 12

		case 1 -> "Monday";
		case 2 -> "Tuesday";
		case 3 -> "Wednesday";
		case 4 -> "Thursday";
		case 5 -> "Friday";
		case 6 -> "Saturday";
		case 7 -> "Sunday";

		default -> "Invalid Day";

		};

	}
	
	
	
	
	public static  boolean  validate( String username , String password , String role) {
		
		
			return switch (role) {
			
			case "admin" -> username.equals("javeed") && password.equals("tiger");
			
			case "user" -> username.equals("tom") && password.equals("tom123");
			
			case "customer" -> username.equals("spiderman") && password.equals("web");
			
			default ->  false;
			
			};
		
		
	}
	
	
	
	
	
	
	

}
