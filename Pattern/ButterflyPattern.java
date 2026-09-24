import java.util.Scanner;

class Pattern{
    private int size;

    public Pattern(int size) {
        this.size=size;
        printPattern();
    }

    public void printPattern() {
        for (int row=0; row<size; row++) {
            for (int col=0; col<=row; col++) {
                System.out.print("*");
            }
            for (int col=0; col<2*((size-row)-1); col++) {
                System.out.print(" ");
            }
            for (int col=0; col<=row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int row=size-1; row>0; row--) {
            for (int col=0; col<row; col++) {
                System.out.print("*");
            }
            for (int col=0; col<(2*(size-row)); col++) {
                System.out.print(" ");
            }
            for (int col=row; col>0; col--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

public class ButterflyPattern{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Rows in one half of the pattern: ");
        int size=sc.nextInt();
        Pattern p=new Pattern(size);

        sc.close();
    }
}