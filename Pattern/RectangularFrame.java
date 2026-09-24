import java.util.Scanner;

class Pattern{
    private int size;

    public Pattern(int size) {
        this.size=size;
        printPattern();
    }

    public void printPattern() {
        for (int row=1; row<=size; row++) {
            for (int col=1; col<=size; col++) {
                if (row==1 || row==size) {
                    System.out.print("*");
                }
                else if (col==1 || col==size) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

public class RectangularFrame{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Rows: ");
        int size=sc.nextInt();
        Pattern p=new Pattern(size);

        sc.close();
    }
}