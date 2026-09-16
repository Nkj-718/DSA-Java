import java.util.Arrays;

class Calculations{
    private int[][] matrix1;
    private int[][] matrix2;

    public Calculations(int[][] matrix1, int[][] matrix2){
        this.matrix1=matrix1;
        this.matrix2=matrix2;
    }

    public int[][] Addition(){
        int[][] resultMatrix = new int[matrix1.length][matrix2[0].length];
        for(int i=0; i<matrix1.length; i++){
            for(int j=0; j<matrix1[0].length; j++){
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return resultMatrix;
    }

    public int[][] Subtraction(){
        int[][] resultMatrix = new int[matrix1.length][matrix2[0].length];
        for(int i=0; i<matrix1.length; i++){
            for(int j=0; j<matrix1[0].length; j++){
                resultMatrix[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return resultMatrix;
    }

    public void showDetails(){
        System.out.println("matrix1: " + Arrays.deepToString(matrix1));
        System.out.println("matrix2: " + Arrays.deepToString(matrix2));
        System.out.println("Addition: " + Arrays.deepToString(Addition()));
        System.out.println("Subtraction: " + Arrays.deepToString(Subtraction()));
    }
}

public class MatrixAddAndSub {
    public static void main(String[] args) {
        int[][] matrix1 = new int[3][3];
        int[][] matrix2 = new int[3][3];
        for(int i=0; i<matrix1.length; i++){
            for(int j=0; j<matrix1[i].length; j++){
                matrix1[i][j]=(int)(Math.random()*10);
            }
        }
        for(int i=0; i<matrix2.length; i++){
            for(int j=0; j<matrix2[i].length; j++){
                matrix2[i][j]=(int)(Math.random()*10);
            }
        }

        Calculations c = new Calculations(matrix1, matrix2);
        c.showDetails();
    }
    
}
