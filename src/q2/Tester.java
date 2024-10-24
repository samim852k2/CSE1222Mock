package q2;

import java.util.ArrayList;

    public class Tester {
        public static void main(String[] args) {

            Matrix matrix = new Matrix(4, 4);

            matrix.set(0, 0, "Top left corner");
            matrix.set(3, 3, "low right corner");
            matrix.set(0, 3, "Top right corner");
            matrix.set(3, 0, "Low right corner");

            System.out.println("Description1 at (0, 0): " + matrix.get(0, 0));
            System.out.println("Description2 at (3, 3): " + matrix.get(3, 3));
            System.out.println("Description3 at (0, 3): " + matrix.get(0, 3));
            System.out.println("Description4 at (3, 0): " + matrix.get(3, 0));
            System.out.println("Description5 at (4, 4): " + matrix.get(4, 4));

            ArrayList<Cell> describedCells = matrix.getDescribedCells();
            System.out.println("Cells with descriptions:");
            for (Cell cell : describedCells) {
                System.out.println("Description at row:" + cell.getRow() + " cell: " + cell.getColumn() + ": " + matrix.get(cell.getRow(), cell.getColumn()));
            }
        }
    }


