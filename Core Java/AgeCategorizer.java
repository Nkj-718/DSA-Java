import java.util.Scanner;

public class AgeCategorizer {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Age: ");
        int age=sc.nextInt();

        String category;

        if(age<=0){
            category="INVALID!";
        } 
        else if(age>0 && age <=12){
            category="CHILD!";
        }
        else if(age>12 && age <=17){
            category="TEENAGER!";
        }
        else{
            category="ADULT!";
        }
        if(category=="ADULT!" && age<=60){
            category="Working class Adult";
        }
        System.out.println("You are: " + category);
        
        sc.close();
    }
}

