package arrays;

public class MultiDimensionArray {

	public static void main(String[] args) {

		int arr[][] = { { 10, 20 }, { 30, 40 , 50 }, {  60 , 70 , 80 ,90 } };

		for (int i = 0; i < arr.length; i++) {

			System.out.println("1 D array printing");

			for (int j = 0; j < arr[i].length; j++) {

				System.out.println(arr[i][j]);

			}

		}

		int arr2[][] = new int[3][2];

		int arr1[][] = new int[3][]; // 2D

		arr1[0] = new int[2]; // 1D

		// initialize values to 1D array
		arr1[0][0] = 50;
		arr1[0][1] = 60;

		arr1[1] = new int[3]; // 1D

		arr1[2] = new int[4]; // 1D

	}

}
