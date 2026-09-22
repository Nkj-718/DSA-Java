import java.util.Scanner;

class Pattern {
    private int size;

    public void setSize(int size) {
        this.size = size;
        printPattern();
    }

    public void printPattern() {
        int start = 1;

        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(start++ + " ");
            }
            System.out.println();
        }
    }
}

public class FloydsTriangle {
    public static void main(String[] args) {
        Pattern p = new Pattern();
        Scanner sc = new Scanner(System.in);

        System.out.print("Rows: ");
        int size = sc.nextInt();
        p.setSize(size);

        sc.close();
    }
}