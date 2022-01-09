// function

package Demo1;

public class demo1 {

	public static void main(String[] args) {
		Cell cell = new Cell();
		cell.eat(3, 4);
		cell.eat(5, 9);
		
		int sum;
		sum = cell.add(4, 5);
		
		System.out.println(cell.x+","+cell.y);
		System.out.println(sum);
	}

}

class Cell {
	//In CLASS, the default value of the object attribute is zero
	int x,y;
	
	//function
	public void eat(int x, int y) {
		this.x += x;
		this.y += y;
	}
	
	public int add(int a, int b) {
		return a+b;
	}
}
