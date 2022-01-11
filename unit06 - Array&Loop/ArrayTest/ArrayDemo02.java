package ArrayTest;

public class ArrayDemo02 {

	public static void main(String[] args) {
		// reference data type
		Cell[] arr = new Cell[4];
		System.out.println(arr[0]);// default initialization is null
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		
		arr[0] = new Cell(2,3);
		arr[1] = new Cell(4,3);
		arr[2] = new Cell(8,3);
		System.out.println(arr[0]);// the value is not null
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
	
		System.out.println(arr[0].row + "," + arr[0].col);// need use double quotation
	}

}


class Cell {
	int row;
	int col;
	
	public Cell(int row, int col) {
		this.row = row;
		this.col = col;
	}
}
