import java.util.Scanner;

public class MarksAnalyzer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Your Marks!");
        System.out.print("Maths: ");
        float maths = sc.nextFloat();
        System.out.print("Physics: ");
        float physics = sc.nextFloat();
        System.out.print("Chemistry: ");
        float chemistry = sc.nextFloat();

        double total = maths+physics+chemistry;
        double percentage = (total)/3;
        boolean isPass=false;
        boolean isDistinction=false;
        if(maths>=40 && physics>=40 && chemistry>=40)
            isPass=true;
        if(maths>=75 && physics>=75 && chemistry>=75)
            isDistinction=true;

        System.out.println("Student Status:-");
        System.out.print("Total Marks: " + total);
        System.out.print("Percentage: " + percentage);
        System.out.print("Passed? " + isPass);
        System.out.print("Distinction? " + isDistinction);
        sc.close();
        }
}
