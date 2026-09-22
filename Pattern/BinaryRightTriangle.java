import java.util.Scanner;

class Pattern{
    private int size;

    public void setSize(int size) {
        this.size = size;
        printPattern();
    }

    public void printPattern() {
        int start = 0;

        for (int row=1; row<=size; row++) {
            if (row%2==1)
                start=1;
            else
                start=0;
            for (int col=1; col<=row; col++) {
                System.out.print(start + " ");
                if (start==0)
                    start=1;
                else
                    start=0;
            }
            System.out.println();
        }
    }
}

public class BinaryRightTriangle {
    public static void main(String[] args) {
        Pattern p=new Pattern();

        Scanner sc=new Scanner(System.in);

        System.out.print("Rows: ");
        int size=sc.nextInt();
        p.setSize(size);

        sc.close();
    }
}