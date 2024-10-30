package enums;

//An Enum class
enum Day {
 SUNDAY,
 MONDAY,
 TUESDAY,
 WEDNESDAY,
 THURSDAY,
 FRIDAY,
 SATURDAY;
}





public class EnumTest {

	Day day;
	
	public  EnumTest(Day day) {
		
		this.day = day;
	}
	
	
	// Prints a line about Day using switch
    public void dayIsLike() {
        switch (day) {
        case MONDAY:
            System.out.println("Mondays are bad.");
            break;
        case FRIDAY:
            System.out.println("Fridays are better.");
            break;
        case SATURDAY:
        case SUNDAY:
            System.out.println("Weekends are best.");
            break;
        default:
            System.out.println("Midweek days are so-so.");
            break;
        }
    }
	
	
	
	
	
	public static void main(String[] args) {

		 String str = "FRIDAY";
		 
		EnumTest  test = new EnumTest(Day.valueOf(str));
		
				test.dayIsLike();
		
		

	}

}
