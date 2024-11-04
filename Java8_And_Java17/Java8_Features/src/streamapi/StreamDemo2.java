package streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo2 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("king");
		list.add("smith");
		list.add("ford");
		list.add("adam");
		list.add("javeed");
		
			Stream<String>  stream1  =	list.stream();
			
			//stream1.forEach((String s1)->{  System.out.println(s1); });
		
			//stream1.forEach(System.out::println); // method reference
		

			stream1.map((String name)->{ System.out.print(name);
												return name.length();
									    })
								.forEach((Integer n)->{System.out.println(n);});
			
			
			
	}

}
