import java.util.Scanner;

class Pattern{
    private int size;

    public Pattern(int size) {
        this.size=size;
        printPattern();
    }

    public void printPattern() {
        int stars, spaces;

        for (int row=1; row<(2*size); row++) {
            if (row<=size) {
                stars=row;
                spaces=2*(size-row);
            }
            else {
                stars=(2*size)-row;
                spaces=2*(row-size);
            }

            for (int col=1; col<=stars; col++) {
                System.out.print("*");
            }
            for (int col=1; col<=spaces; col++) {
                System.out.print(" ");
            }
            for (int col=1; col<=stars; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

public class ButterflyPatternApproach2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Rows in half of the butterfly: ");
        int size=sc.nextInt();
        Pattern p=new Pattern(size);

        sc.close();
    }
}