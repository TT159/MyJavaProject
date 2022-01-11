package ArrayTest;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		
		
		//Method 1: system.arraycopy();
		int[] src = {0,1,2,3,4,5};
		int[] dest = {4,3,2,1,0,0,0,0,0,0};
		
		/*
		 * System.arraycopy(src, srcPos, dest, destPos, length);
		 * src -  source array; srcPos - start position
		 * length - the number of elements to copy 
		 * BE CAREFUL! Never out of range of the array
		 */
		System.arraycopy(src, 1, dest, 0, 3);// copy 3 elements start with index 1
		for(int i=0; i<dest.length;i++) {
			System.out.print(dest[i]+" ");
		}
		System.out.println();
		
		//Method 2: Arrays.copyOf()
		int[] arr = {2,3,1,54,5,6,7};
		//           0,1,2,3 ,4,5,6
		int[] arr1 = Arrays.copyOf(arr, 7);
		for(int i=0; i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println("\n");
		
		
		
	}

}
