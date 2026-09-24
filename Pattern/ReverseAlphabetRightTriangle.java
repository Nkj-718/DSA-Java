import java.util.Scanner;

class RTriangle{
    private int size;

    public RTriangle(int size) {
        this.size=size;
        printTriangle();
    }

    public void printTriangle() {
        for (int row=0; row<size; row++) {
            char val=(char)('A'+((size-row)-1));

            for (char col=val; col<('A'+size); col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}

public class ReverseAlphabetRightTriangle{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Rows: ");
        int size=sc.nextInt();
        RTriangle r=new RTriangle(size);

        sc.close();
    }
}