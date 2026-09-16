import java.util.Arrays;

class Calculations{
    private int[][] matrix1;
    private int[][] matrix2;

    public Calculations(int[][] matrix1, int[][] matrix2){
        this.matrix1=matrix1;
        this.matrix2=matrix2;
    }

    public int[][] Multiplication(){
        int[][] resultMatrix = new int[matrix1.length][matrix2[0].length];

        for(int i=0; i<matrix1.length; i++){
            for(int j=0; j<matrix2[0].length; j++){
                int temp=0;
                for(int k=0; k<matrix2.length; k++){
                    temp=temp+(matrix1[i][k]*matrix2[k][j]);
                }
                resultMatrix[i][j]=temp;
            }
        }

        return resultMatrix;
    }

    public int[][] Division(){
        int[][] resultMatrix = new int[matrix1.length][matrix2[0].length];
        for(int i=0; i<matrix1.length; i++){
            for(int j=0; j<matrix2[0].length; j++){
                int temp=0;
                for(int k=0; k<matrix2.length; k++){
                    if(matrix2[k][j]==0)
                        temp=temp+0;
                    else
                        temp=temp+(matrix1[i][k]/matrix2[k][j]);
                }
                resultMatrix[i][j]=temp;
            }
        }
        return resultMatrix;
    }

    public void showDetails(){
        System.out.println("matrix1: " + Arrays.deepToString(matrix1));
        System.out.println("matrix2: " + Arrays.deepToString(matrix2));
        System.out.println("Multiplication: " + Arrays.deepToString(Multiplication()));
        System.out.println("Division: " + Arrays.deepToString(Division()));
    }

}

public class MatrixMultiplyAndDivide {
    public static void main(String[] args) {
        int[][] matrix1 = new int[2][3];
        int[][] matrix2 = new int[3][4];
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
