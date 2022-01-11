package ArrayTest;

import java.util.Arrays;

public class ArrayExpand {

	public static void main(String[] args) {
		//"expand" the array
		//in Java, there is no real expand; The size/length of array can not be expand
		//expand the array; Actually is replaced by a new array
		int[] arr = {3,5,6,7,8};
		arr = Arrays.copyOf(arr, arr.length+1);//length expand 1, default value is 0
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
