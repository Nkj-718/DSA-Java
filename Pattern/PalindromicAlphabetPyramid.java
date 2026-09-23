import java.util.Scanner;

class Pattern{
    private int size;

    public Pattern(int size) {
        this.size=size;
        printPattern();
    }

    public void printPattern() {
        for (int row=0; row<size; row++) {
            char val='A'-1;

            for (int space=0; space<=((size-row)-1); space++) {
                System.out.print(" ");
            }
            for (int alpha=0; alpha<((2*row)+1); alpha++) {
                if (alpha <= (2*row)/2)
                    System.out.print(++val);
                else
                    System.out.print(--val);
            }
            for (int space=0; space<=((size-row)-1); space++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

public class PalindromicAlphabetPyramid{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Rows: ");
        int size=sc.nextInt();
        Pattern p=new Pattern(size);

        sc.close();
    }
}