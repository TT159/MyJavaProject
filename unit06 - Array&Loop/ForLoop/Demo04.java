// while loop

package ForLoop;

import java.util.Random;

public class Demo04 {

	public static void main(String[] args) {
		/*
		 play with three dices
		 when the numbers of dices are the same, stop the iteration 
		 */
		
		int dice1 = 1;
		int dice2 = 2;
		int dice3 = 3;
		
		Random random = new Random();
		// While loop: check first, then execute
		// only dice1=dice2=dice3, iteration stop
		while(dice1!=dice2 || dice1!=dice3) {
			dice1 = random.nextInt(7-1)+1;//[1,7)
			dice2 = random.nextInt(7-1)+1;
			dice3 = random.nextInt(7-1)+1;
			System.out.println(dice1+","+dice2+","+dice3);
		}
		

	}

}
