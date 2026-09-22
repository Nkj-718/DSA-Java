import java.util.Scanner;

class Pattern{
    private int size;

    public Pattern(int size){
        this.size=size;
    }

    public void printPattern(){
        for (int i=1; i<=size; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

}

public class NumericRightTriangle {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter size: ");
        int size=sc.nextInt();
        Pattern p=new Pattern(size);
        p.printPattern();

        sc.close();
    }
}
