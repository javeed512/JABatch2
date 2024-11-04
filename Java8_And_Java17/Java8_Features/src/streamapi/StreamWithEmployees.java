package streamapi;

import java.util.HashSet;
import java.util.Set;



public class StreamWithEmployees {

	public static void main(String[] args) {

		Set<Employee>  set  = new HashSet<Employee>();
		
		
		set.add(new Employee(101, "king", 50000));
		set.add(new Employee(103, "adam", 40000));
		set.add(new Employee(102, "smith", 60000));
		set.add(new Employee(104, "virat", 30000));
		
		
			set.stream().filter((e1)->{ return  e1.getSalary() > 35000; })
						.forEach(System.out::println);
		
		Double sumOfSalary =	set.stream().map((Employee e1)->{ return e1.getSalary() ;})
						      .reduce( (Double s1,Double s2) -> {return s1+s2 ;} ).orElse(0.0);
						
		System.out.println("sum of salary "+sumOfSalary);
		

	}

}
