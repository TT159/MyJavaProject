package AccessControl;

public class FinalDemo {

	public static void main(String[] args) {
		/*
		 * using final to confine the variable which can not be modified anymore
		 */
		
		final int a;
		//the first time initialization
		a = 3;
		System.out.println(a);
		/*
		 * a=10;//WRONG! compile bug
		 */
		final int[] arr = {2,3,4};
		//what can't be changed is the address of the array arr rather than the element
		//value in the array
		arr[0] = 9;
		System.out.println(arr[0]);
		

	}

}
