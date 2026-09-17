import java.util.Scanner;

class Operations{
    private StringBuilder str;

    public Operations(StringBuilder str){
        this.str=str;
    }

    public void showDetails(){
        System.out.println("Original String: " + str);
        System.out.println("Reverse String: " + str.reverse());
        System.out.println("Pallindrome: " + (str.toString().equals(str.reverse().toString())));
    }

}

public class PallindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String temp=sc.nextLine();

        StringBuilder str = new StringBuilder(temp);

        Operations op = new Operations(str);
        op.showDetails();

        sc.close();
    }
}
