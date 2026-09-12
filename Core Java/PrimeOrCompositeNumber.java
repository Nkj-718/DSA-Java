import java.util.Scanner;

public class PrimeOrCompositeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long num=sc.nextLong();
        boolean prime=true;
        int i=2;
        while(i<=(num/2)){
            if(num%i==0)
                prime=false;
            i++;
        }
        if(prime)
            System.out.println(num + " is prime.");
        else
            System.out.println(num + "is composite.");

        sc.close();
    }
}
