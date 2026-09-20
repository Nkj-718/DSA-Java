import java.util.Scanner;

class Pattern {
    private int size;
    public void setSize(int size) {
        this.size = size;
    }
    public void printPattern() {
        
        for (int i=1; i<=size; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i=size-1; i>0; i--) {
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

public class AsteriskRightArrow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of half: ");
        int size = sc.nextInt();
        Pattern p = new Pattern();
        p.setSize(size);
        p.printPattern();
        sc.close();
    }
}