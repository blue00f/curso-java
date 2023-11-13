package ejercicio_05;

public class Matrix {
	private int rows;
	private int columns;
	private double[][] data;
	public Matrix(int rows, int columns) {
		this.setRows(rows);
		this.setColumns(columns);
		this.data = new double[rows][columns];
	}

	public void setRows(int rows) {
		this.rows = rows;
	}
	public void setColumns(int columns) {
		this.columns = columns;
	}
	public int getRows() {
		return rows;
	}
	public int getColumns() {
		return columns;
	}
	public double getValueByIndex(int row, int column) {
		return data[row][column];
	}
	public void setValueByIndex(int row, int column, double newValue) {
		data[row][column] = newValue;
	}
}
