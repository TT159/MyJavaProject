package SwitchCaseDemo;

import java.io.Console;
import java.util.Scanner;

public class demo01 {
	
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Please input the score: ");
		int score = console.nextInt();
		switch(score/10) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
		case 6:
			System.out.println("C");
			break;
		default:// none of above
			System.out.println("D");
		}
	}
}
