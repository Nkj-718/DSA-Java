import java.util.Scanner;

class Diamond {
    private int size;

    public Diamond(int size) {
        this.size = size;
    }

    public void printDiamond() {
        for (int i=0; i<size; i++) {
            for (int lSpace=1; lSpace<=(size-i-1); lSpace++) {
                System.out.print(" ");
            }
            for (int stars=2*i+1; stars>0; stars--) {
                System.out.print("*");
            }
            for (int rSpace=1; rSpace<=(size-i-1); rSpace++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = size - 1; i >= 0; i--) {
            for (int lSpace=(size-i-1); lSpace>0; lSpace--) {
                System.out.print(" ");
            }
            for (int stars=2*i+1; stars>0; stars--) {
                System.out.print("*");
            }
            for (int rSpace=(size-i-1); rSpace>0; rSpace--) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

public class AsteriskDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of each half of Diamond: ");
        int size = sc.nextInt();
        Diamond d = new Diamond(size);
        d.printDiamond();
        sc.close();
    }
}