import java.util.Scanner;

class Pattern{
    private int size;

    public Pattern(int size){
        this.size=size;
    }

    public void printPattern(){
        for(int i=1; i<=size; i++){
                for(int j=1; j<=size; j++){
                    System.out.print("*");;
                }
                System.out.println();
            }
    }

}

public class AsteriskRectangle {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter size: ");
        int size=sc.nextInt();
        Pattern p=new Pattern(size);
        p.printPattern();

        sc.close();
    }
}
