import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Starting Balance
        double balance=10000;
        double money=0;

        byte choice=0;

        System.out.println("You have ₹" + balance + " to start with.\nChoose an operation to perform.");
        while(choice!=4){
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choice: ");
            choice = sc.nextByte();
            
            if(choice==1){
                System.out.println("Your balance is: ₹" + balance);
            }
            else if(choice==2){
                System.out.print("Enter amount of money to deposit: ");
                money=sc.nextDouble();
                if(money>0){
                    balance=balance+money;
                    System.out.println("Your money has been deposited successfully!");
                }
                else{
                    System.out.println("Invalid amount of money to deposit!");
                }
            }
            else if(choice==3){
                System.out.print("Enter amount of money to withdraw: ");
                money=sc.nextDouble();
                if(money>0 && money<=balance){
                    balance=balance-money;
                    System.out.println("You have withdrawn ₹" + money + " from your account!");
                }
                else{
                    System.out.println("You can't withdraw the entered amount!");
                }
            }
            else if(choice==4){
                System.out.println("Session terminated!");
            }
            else{
                System.out.println("Invalid Operation. Please Try again!");
            }
        }
        
        sc.close();
    }    
}
