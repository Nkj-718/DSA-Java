import java.util.Scanner;

class Pattern{
    private int size;

    public void setSize(int size) {
        this.size=size;
        printPattern();
    }

    public void printPattern() {
        for (int row=1; row<=(2*size)-1; row++) {
            for (int col=1; col<=(2*size)-1; col++) {
                int element;

                if (row==1 || row==(2*size)-1 || col==1 || col==(2*size)-1) {
                    System.out.print(size + " ");
                }
                else {
                    int top=row;
                    int left=col;
                    int bottom=(2*size)-row;
                    int right=(2*size)-col;
                    int min;

                    if (top<left && top<right && top<bottom)
                        min=top;
                    else if (left<right && left<bottom)
                        min=left;
                    else if (right<bottom)
                        min=right;
                    else
                        min=bottom;

                    element=(size-min)+1;
                    System.out.print(element + " ");
                }
            }
            System.out.println();
        }
    }
}

public class ConcentricNumberSquare{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Size: ");
        int size=sc.nextInt();
        Pattern p=new Pattern();
        p.setSize(size);

        sc.close();
    }
}