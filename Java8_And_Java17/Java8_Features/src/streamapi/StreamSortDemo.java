package streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamSortDemo {

	public static void main(String[] args) {


		List<String> list = new ArrayList<String>();

		list.add("king");
		list.add("smith");
		list.add("ford");
		list.add("adam");
		list.add("javeed");
		
			Stream<String>  stream1  =	list.stream();
			
			
				//stream1.sorted().forEach(System.out::println);
			
					//stream1.sorted(Comparator.reverseOrder()).forEach(System.out::println);
			
		stream1.sorted(
			(str1, str2)  -> Character.compare(str1 .charAt(str1.length() - 1), 
												str2.charAt(str2.length() - 1))) 
													 .forEach(System.out::println); 
                   
	}

}
