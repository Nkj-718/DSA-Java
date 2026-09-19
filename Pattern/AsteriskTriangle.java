import java.util.Scanner;

class Pattern{
    private int size;

    public Pattern(int size){
        this.size=size;
    }

    public void printPattern(){
        for(int i=0; i<size; i++){
                for(int lSpace=1; lSpace<=(size-i-1); lSpace++){
                    System.out.print(" ");
                }
                for(int stars=2*i+1; stars>0; stars--){
                    System.out.print("*");
                }
                for(int rSpace=1; rSpace<=(size-i-1); rSpace++){
                    System.out.print(" ");
                }
                System.out.println();
       }
    }

}

public class AsteriskTriangle {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter size: ");
        int size=sc.nextInt();
        Pattern p=new Pattern(size);
        p.printPattern();

        sc.close();
    }
}
