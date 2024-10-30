package arrays;

public class ArrayDemo {

	public static void main(String[] args) {


		int arr[] = {2,4,6,8,10};  // Integer class
		
		System.out.println("size of array "+arr.length);
		
			System.out.println("element at index 0 "+arr[0]);
		
			System.out.println("Normal For loop");
		
			for (int i = 0; i < arr.length; i++) {
				
				System.out.println(arr[i]);
				
			
				
			}
			
			
			System.out.println("For Each Loop");
			
			for(int x : arr ) {   // read only loop  or foreach or enhance for loop
				
				System.out.println(x);
				
			}
			
			
			
		
	}

}
