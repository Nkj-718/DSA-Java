import java.util.Scanner;
import java.util.Arrays;

class MatrixOperations{
    private int[][] matrix;

    public MatrixOperations(int[][] matrix){
        this.matrix=matrix;
    }

    public void showDetails(){
        System.out.println("Sum of Matrix: " + sumOfMatrix());

        for(int i=0; i<matrix.length; i++)
            System.out.println("Sum of Row " + i + ": " + sumOfRow(i));

        for(int i=0; i<matrix[0].length; i++){
            System.out.println("Sum of Column " + i + ": " + sumOfColumn(i));
        }

        for(int i=0; i<matrix.length; i++){
            System.out.println("Row " + i + ": " + Arrays.toString(matrix[i]));
        }

        for(int i=0; i<matrix[0].length; i++){
            System.out.print("Column " + i + ": [");
            for(int j=0; j<matrix.length; j++){
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println("]");
        }

        System.out.println("Largest Element in Matrix: " + largestElement());

        System.out.println("Smallest Element in Matrix: " + smallestElement());

        System.out.println("Transposed Matrix: " + Arrays.deepToString(transposeMatrix()));
    }

    public int sumOfRow(int i){
        int sum=0;
        for(int itr : matrix[i]){
            sum+=itr;
        }
        return sum;
    }

    public int sumOfColumn(int i){
        int sum=0;
        for(int j=0; j<matrix.length; j++)
            sum+=matrix[j][i];
        return sum;
    }

    public int sumOfMatrix(){
        int sum=0;
        for(int i[] : matrix){
            for(int j : i){
                sum+=j;
            }
        }
        return sum;
    }
    public int largestElement(){
        int max=matrix[0][0];
        for(int i[] : matrix){
            for(int j : i)
                max=(max<j) ? j : max;
        }
        return max;
    }
    public int smallestElement(){
        int min=matrix[0][0];
        for(int i[] : matrix){
            for(int j : i)
                min=(min>j) ? j : min;
        }
        return min;
    }
    public int[][] transposeMatrix(){
        int[][] transpose = new int[matrix[0].length][matrix.length];

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                transpose[j][i] = matrix[i][j];
            }
        }

        return transpose;
    }
}

public class MatrixAnalyzer {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows in Matrix: ");
        int rows=sc.nextInt();
        System.out.print("Enter number of columns in Matrix: ");
        int columns=sc.nextInt();
        int[][] matrix = new int[rows][columns];
        for(int i=0; i<rows; i++){
            System.out.println("Enter Row " + i + " elements: ");
            for(int j=0; j<columns; j++){
                System.out.print("Element " + j + ": ");
                matrix[i][j]=sc.nextInt();
            }
        }

        MatrixOperations m = new MatrixOperations(matrix);
        m.showDetails();

        sc.close();
    }
}