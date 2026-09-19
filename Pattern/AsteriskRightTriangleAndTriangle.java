import java.util.Scanner;

class RTriangle {
    protected int size;

    public RTriangle(int size) {
        this.size = size;
    }

    public void printRTriangle() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class Triangle extends RTriangle {

    public Triangle(int size) {
        super(size);
    }

    public void printTriangle() {
        for (int i = 0; i < size; i++) {

            for (int lSpace = 1; lSpace <= (size - i - 1); lSpace++) {
                System.out.print(" ");
            }

            for (int stars = (2 * i + 1); stars > 0; stars--) {
                System.out.print("*");
            }

            for (int rSpace = 1; rSpace <= (size - i - 1); rSpace++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}

public class AsteriskRightTriangleAndTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Size: ");
        int size = sc.nextInt();

        System.out.println("Right Triangle:-");
        RTriangle r = new RTriangle(size);
        r.printRTriangle();

        System.out.println("Triangle:-");
        Triangle t = new Triangle(size);
        t.printTriangle();

        sc.close();
    }
}