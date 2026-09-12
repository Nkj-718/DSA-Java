import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter units consumed: ");
        double unit=sc.nextDouble();

        double bill=0;

        // Approach 1:
        // int i=0;
        // while(i<unit){
        //     if(i<100)
        //         bill=bill+5;
        //     else if(i<200)
        //         bill=bill+7;
        //     else
        //         bill=bill+10;
        //     i++;
        // }

        // Approach 2:
        if(unit>0){
            if(unit<=100){
                bill=bill+(unit*5);
                unit=0;
            }
            else{
                bill=bill+500;
                unit-=100;
                if(unit>0 && unit<100){
                    bill=bill+(unit*7);
                    unit=0;
                }
                else{
                    bill=bill+700;
                    unit-=100;
                }
                bill=bill+(unit*10);
                unit=0;
            }
        System.out.println("Your bill is: ₹" + bill);
        }
        else{
            System.out.println("Invalid Amount of units entered!");
        }

        sc.close();
    }    
}
