import java.util.Scanner;

class Pattern{
    private int rows;

    public Pattern(int rows) {
        this.rows=rows;
        printPattern();
    }

    public void printPattern() {
        for (int row=0; row<rows; row++) {
            char val=(char)('A'+row);

            for (int col=0; col<=row; col++) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}

public class AlphabetSlabRightTriangle{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Rows: ");
        int rows=sc.nextInt();
        Pattern p=new Pattern(rows);

        sc.close();
    }
}