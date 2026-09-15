/*
Identity matrix? 
Symmetric matrix? 
Sum of main diagonal?  
Sum of secondary diagonal?
count of even no.  
count of odd no.  
count of postitive and negative no.  
*/

import java.util.Scanner;
import java.util.Arrays;

class MatrixOperations{
    private int[][] matrix;

    public MatrixOperations(int[][] matrix){
        this.matrix=matrix;
    }

    public boolean isIdentityMatrix(){
        boolean isTrue = true;
        boolean breakLoop=false;

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if((i==j && matrix[i][j]!=1) || (i!=j && matrix[i][j]!=0)){
                    isTrue=false;
                    breakLoop=true;
                    break;
                }
            }
            if(breakLoop)
                break;
        }

        return isTrue;
    }

    public boolean isSymmetric(){
        boolean isTrue=true;
        boolean breakLoop=false;

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(matrix[i][j]!=matrix[j][i]){
                    isTrue=false;
                    breakLoop=true;
                    break;
                }
            }
            if(breakLoop)
                break;
        }

        return isTrue;
    }

    public int sumOfMainDiagonal(){
        int sum=0;
        for(int i=0; i<matrix.length; i++){
            sum+=matrix[i][i];
        }
        return sum;
    }

    public int sumOfSecondaryDiagonal(){
        int sum=0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if((i+j)==(matrix[i].length-1))
                    sum+=matrix[i][j];
            }
        }
        return sum;
    }
    
    public int countOfEvenNumbers(){
        int count=0;

        for(int[] i : matrix){
            for(int j : i){
                if(j%2==0)
                    count++;
            }
        }

        return count;
    }
    
    public int countOfOddNumbers(){
        int count=0;

        for(int[] i : matrix){
            for(int j : i){
                if(j%2==1)
                    count++;
            }
        }

        return count;
    }

    public int totalElements(){
        int count=0;
        for(int[] i : matrix){
            count+=i.length;
        }
        return count;
    }

    public int countOfPositiveNumbers(){
        int count=0;

        for(int[] i : matrix){
            for(int j : i){
                if(j>0)
                    count++;
            }
        }

        return count;
    }

    public int countOfNegativeNumbers(){
        int count=0;

        for(int[] i : matrix){
            for(int j : i){
                if(j<0)
                    count++;
            }
        }

        return count;
    }

    public void showDetails(){
        System.out.println("Matrix: " + Arrays.deepToString(matrix));
        System.out.println("Total number of elements: " + totalElements());
        System.out.println("Is it an Identity Matrix?" + isIdentityMatrix());
        System.out.println("Is it a Symmetric Matrix?" + isSymmetric());
        System.out.println("Count of EVEN numbers in the matrix: " + countOfEvenNumbers());
        System.out.println("Count of ODD numbers in the matrix: " + countOfOddNumbers());
        System.out.println("Count of POSITIVE numbers in the matrix: " + countOfPositiveNumbers());
        System.out.println("Count of NEGATIVE numbers in the matrix: " + countOfNegativeNumbers());
        System.out.println("Count of zeroes in the matrix: " + ((totalElements())-(countOfPositiveNumbers()+countOfNegativeNumbers())));
    }
}

public class MatrixProperties {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the square matrix: ");
        int size = sc.nextInt();

        int[][] matrix = new int[size][size];

        for(int i=0; i<matrix.length; i++){
            System.out.println("Enter elements in Row " + i + ":-");
            for(int j=0; j<matrix[i].length; j++){
                System.out.print("Enter element " + j + ": ");
                matrix[i][j]=sc.nextInt();
            }
        }

        MatrixOperations m = new MatrixOperations(matrix);
        m.showDetails();
    
        sc.close();
    }
}
