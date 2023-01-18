import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrix2;
        int nRows, nCols;

        Scanner e = new Scanner(System.in);
        System.out.print("Type number of rows: ");
        nRows = e.nextInt();
        System.out.print("Type number of Columns: ");
        nCols = e.nextInt();

        matrix2 = new int[nRows][nCols];
        for(int i=0;i<nRows;i++){
            for (int j=0;j<nCols;j++){
                System.out.print("Matrix ["+i+"]["+j+"]: ");
                matrix2[i][j] = e.nextInt();
            }
        }
        for(int i=0;i<nRows;i++){
            for (int j=0;j<nCols;j++){
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}