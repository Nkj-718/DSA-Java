import java.util.Scanner;

class Pattern{
    private int rows;

    public Pattern(int rows) {
        this.rows=rows;
        printPattern();
    }

    public void printPattern() {
        for (int row=rows; row>0; row--) {
            for (char col='A'; col<'A'+row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}

public class AlphabetInvertedRightTriangle{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Rows: ");
        int rows=sc.nextInt();
        Pattern p=new Pattern(rows);

        sc.close();
    }
}