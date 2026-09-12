import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your precentage: ");
        int percentage = sc.nextInt();
        char grade;
        
        if(percentage>=90 && percentage<=100)
            grade='A';
        else if(percentage>=80)
            grade='B';
        else if(percentage>=70)
            grade='C';
        else if(percentage>=60)
            grade='D';
        else if(percentage>=40)
            grade='E';
        else if(percentage>=0 && percentage<40)
            grade='F';
        else
            grade='Z';
        
        if(grade=='Z')
            System.out.println("Invalid Percentage!");
        else if(grade>='A' && grade<='E')
            System.out.println("Grade: " + grade);
        else
            System.out.println("You failed. Try again.");
        
        sc.close();
    }    
}
