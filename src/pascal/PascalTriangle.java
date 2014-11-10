package pascal;

public class PascalTriangle {

	public static void main(String[] args) {
		
		pascalTriangle(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
		
	}
	
	/*
	 * Pre: 0 <= column <= row
	 * Post: Pascal number for column and row
	 */
	public static void pascalTriangle(int row, int column) { 
		System.out.println(" Pascal number for column: " + column + " and row: " + row + " is: " + pascal(row, column));
	}

	/*
	 * pre: column and row must be numbers
	 * post: pascal number of the column and the row
	 */
	private static int pascal(int column, int row) {
		if ( column > row) return 0;
		else if ( column < 0) return 0;
		else if ( column == 0) return 1;
		else if ( column == row) return 1;
		else return (pascal(column - 1, row - 1) + pascal(column - 1, row));
	}

}
