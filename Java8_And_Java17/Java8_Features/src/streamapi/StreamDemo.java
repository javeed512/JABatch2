package streamapi;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {


		Integer arr[] = {2,4,6,8,10};
		
		Stream<Integer> stream1 =	Arrays.stream(arr);
			
			stream1.filter((Integer num)->{ return num > 5;})  // intermediate operation
					.forEach((Integer x)->{ System.out.println(x); }); // terminal operation
		
		
		
	}

}
