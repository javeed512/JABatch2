package switchexpressions;

public class SwithExpEnums {

	 public static void main(String[] args) {
		
		 
		 System.out.println("Is Week Day " +isWeekDayV1_1(Day.MON) );
		 System.out.println("Is Week Day "+isWeekDayV1_1(Day.SUN) );
		 
		 System.out.println("Is Week Day "+isWeekDayV1_2(Day.WED) );
		 
	}
	
	
	
	
	//1 - Return value directly

		enum Day {
			MON, TUE, WED, THUR, FRI, SAT, SUN
		};

		
		public static Boolean isWeekDayV1_1 (Day day)
		{
			Boolean result = switch(day) {
				case MON, TUE, WED, THUR, FRI -> {System.out.println("Weekday"); yield true; }
				case SAT, SUN ->  { System.out.println("Weekend ");  yield false; }
			};
			return result;
		}
		
		public static Boolean isWeekDayV1_2 (Day day)
		{
			Boolean result = switch(day) {
				case MON, TUE, WED, THUR, FRI : yield true;
				case SAT, SUN : yield false;
			};
			return result;
		}
	
	
	
}
