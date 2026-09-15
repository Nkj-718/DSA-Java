/* 
Element Searching
Frequency of Occuring
First Position
Largest Element Position
Smallest Element Position
*/
import java.util.Scanner;
import java.util.Arrays;

class ElementOperations{
    private int[][] matrix;
    private int element;

    public ElementOperations(int[][] matrix, int element){
        this.matrix=matrix;
        this.element=element;
    }

    public String elementPosition(){
        String str="Element not Present in the Matrix";
        boolean breakLoop=false;

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(matrix[i][j]==element){
                    str="[row, column]: " + "[ " + i + ", " + j + " ]";
                    breakLoop=true;
                    break;
                }
            }
            if(breakLoop)
                break;
        }

        return str;
    }

    public int elementCount(){
        int count=0;

        for(int[] i : matrix){
            for(int j : i){
                if(j==element)
                    count++;
            }
        }

        return count;
    }

    public String largestElement(){
        int max=matrix[0][0];
        int row=0;
        int column=0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(matrix[i][j]>max){
                    max=matrix[i][j];
                    row=i;
                    column=j;
                }
            }
        }
        String str = max + " is present at position[row,column]: " + "[ " + row + ", " + column + " ]";
        return str;
    }

    public String smallestElement(){
        int min=matrix[0][0];
        int row=0;
        int column=0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(matrix[i][j]<min){
                    min=matrix[i][j];
                    row=i;
                    column=j;
                }
            }
        }
        String str = min + " is present at position[row,column]: " + "[ " + row + ", " + column + " ]";
        return str;
    }

    public void showDetails(){
        System.out.println("Matrix: " + Arrays.deepToString(matrix));
        System.out.println("Element to search: " + element);
        System.out.println("Element Position: " + elementPosition());
        System.out.println("Element Frequency in Matrix: " + elementCount());
        System.out.println("Largest Element in Matrix: " + largestElement());
        System.out.println("Smallest Element in Matrix: " + smallestElement());
    }
}

public class MatrixSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows in Matrix: ");
        int row=sc.nextInt();
        System.out.print("Enter number of columns in Matrix: ");
        int column=sc.nextInt();

        int[][] matrix = new int[row][column];
        for(int i=0; i<row; i++){
            System.out.println("Enter Row " + i + " elements: ");
            for(int j=0; j<column; j++){
                System.out.print("Element " + j + ": ");
                matrix[i][j]=sc.nextInt();
            }
        }

        System.out.print("Enter the element to search for: ");
        int element = sc.nextInt();

        ElementOperations e = new ElementOperations(matrix, element);
        e.showDetails();

        sc.close();
    }    
}
