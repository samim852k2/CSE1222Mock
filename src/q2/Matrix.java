package q2;

import java.util.ArrayList;

public class Matrix {

    private String[][] grid;
    private int Rows;
    private int Columns;


    public Matrix(int numRows, int numColumns) {
        this.Rows = numRows;
        this.Columns = numColumns;
        this.grid = new String[numRows][numColumns];
    }

    public void set(int row, int column, String message) {
        if (column >= 0 && column < Columns && row >= 0 && row < Rows  ) {
            grid[row][column] = message;
        } else {
            System.out.println("Invalid row or column index.");
        }
    }


    public String get(int row, int column) {
        if (column >= 0 && column < Columns && row >= 0 && row < Rows) {
            return grid[row][column];
        }
        else {
            System.out.println("Invalid row or column index.");
            return  " ";
        }

    }

    public ArrayList<Cell> getDescribedCells() {
        ArrayList<Cell> answer = new ArrayList<>();
        for (int i = 0; i < Rows; i++) {
            for (int j = 0; j < Columns; j++) {
                if (grid[i][j] != null) {
                    answer.add(new Cell(i, j));
                }

            }
        }
        return answer;
    }



}