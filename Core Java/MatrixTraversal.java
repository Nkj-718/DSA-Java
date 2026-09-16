import java.util.Scanner;
import java.util.Arrays;

class Traversals{
    private int[][] matrix;

    public Traversals(int[][] matrix){
        this.matrix=matrix;
    }

    public String boundaryTraversal(){
        int top=0;
        int right=matrix[top].length-1;
        int down=matrix.length-1;
        int left=0;
        String str="";

        for(int i=left; i<right; i++){
                str+=matrix[top][i]+"->";
            }

            for(int i=top; i<down; i++){
                str+=matrix[i][right]+"->";
            }

            for(int i=right; i>left; i--){
                str+=matrix[down][i]+"->";
            }
            
            for(int i=down; i>top; i--){
                str+=matrix[i][left]+"->";
            }
        return str;
    }

    public String spiralTraversal(){
        String str="";
        int top=0;
        int down=matrix.length-1;
        int left=0;
        int right=matrix[top].length-1;
        int count=0;
        for(int[] m : matrix){
            count+=m.length;
        }

        while(count>0){
            for(int i=left; i<=right; i++){
                str+="->" + matrix[top][i];
                count--;
            }

            for(int i=top+1; i<=down; i++){
                str+="->" + matrix[i][right];
                count--;
            }

            for(int i=right-1; i>=left; i--){
                str+="->" + matrix[down][i];
                count--;
            }
            
            for(int i=down-1; i>top; i--){
                str+="->" + matrix[i][left];
                count--;
            }
            top++;
            right--;
            down--;
            left++;

        }
        return str;
    }

}

public class MatrixTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int column = sc.nextInt();

        int[][] matrix = new int[row][column];

        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                matrix[i][j] = (int)(Math.random()*10);
            }
        }

        System.out.println("Matrix: " + Arrays.deepToString(matrix));

        Traversals t = new Traversals(matrix);
        System.out.println("Boundary Traversal: " + t.boundaryTraversal());
        System.out.println("Spiral Traversal: " + t.spiralTraversal());

        sc.close();
    }
}
