package unit02;

import java.util.Scanner;

public class Demo03 {

	public static void main(String[] args) {
		//check the special year: 366 days
		//condition1: can be divided by 4, and except the multiple of 100
		//condition2: can be divided by 400
		//if meet one of two, then it is a special year 
		//eg: 2000 is a special year
		// use the system API, Scanner can get the user input
		Scanner console = new Scanner(System.in);
		System.out.print("Please input the year: ");
		int year = console.nextInt();
		boolean b = ((year%4==0) && !(year%100==0)) || (year%400 == 0);
		
		System.out.println(b);

	}

}
