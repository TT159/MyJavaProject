package ForLoop;

import java.util.Scanner;

public class Demo05 {

	public static void main(String[] args) {
		// the game of guessing the number
		
		Scanner console = new Scanner(System.in);
		int num = (int)(Math.random()*100);
		System.out.println("Let's guess!");
		int guess;
		do {
			guess = console.nextInt();//read the user input from console
			if(guess<num) {
				System.out.println("It's a little bit small");
			} else if(guess>num) {
				System.out.println("Opps! It's too large!");
			}else if(guess == num) {
				System.out.println("Cong! You're right!");
			}
		} while(guess!=num);

	}

}
