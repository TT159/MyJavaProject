package ArrayTest;

public class ArrayDemo01 {

	public static void main(String[] args) {
		//method 1: initial with array length
		//initialize, the default value is zero
		int[] arr = new int[4];//0,0,0,0
		System.out.println(arr[2]);
		
		//assignment
		arr[0] = 3;
		arr[1] = 34;
		arr[2] = 310;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);

		int n = arr[2] + arr[0]*10;
		System.out.println(n);
		// we can use length to calculate the length of the array
		System.out.println(arr.length);
		
		
		double[] arr1 = new double[3];
		System.out.println(arr1[0]);//0.0
		arr1[0] = 35;
		System.out.println(arr1[0]);//35.0
		
		
		//method 2: initial with known values
		int[] arr2 = new int[] {3,5,6,87,9};
		System.out.println(arr2[4]);

		//simplify format:
		//however, it can only be used to initialize array at the same with declaration  
		int[] arr3 = {3,5,6,87,9}; 
		System.out.println(arr3[4]);
		/*
		 int[] arr4;
		 arr4 = {3,4,5,6};// Wrong!
		 */
		
		// char array
		char[] chs = new char[5];//default value: the character whose serial number=0 
		System.out.println((int)chs[3]);//0
		
	}

}
