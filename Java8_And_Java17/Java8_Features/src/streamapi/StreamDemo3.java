package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamDemo3 {

	public static void main(String[] args) {

		List<Integer>  list  = Arrays.asList(11,3,44,5,66,33,44);
		
			list.stream().distinct().skip(4).forEach(System.out::println);
		
			
			 List<Integer> list2 = Arrays.asList(2,4,6,8);
			 
	Optional<Integer> optional = list2.stream().reduce((Integer a, Integer b)->{ return a+b;});
			 	
			Integer result =	optional.orElse(0);
	
	
				System.out.println("Reduce Result "+result);
		
		
	}

}
