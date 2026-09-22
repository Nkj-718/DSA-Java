import java.util.Scanner;

class Session{
    private static final String SEPARATOR="****************************************************";
    public void startSession(Scanner sc){

        sc.nextLine();
        System.out.println("What's your name?");
        String accountHolderName=sc.nextLine();
        Account account = new Account(accountHolderName);
        int amount;
        int choice;

        do{
            System.out.println("");
            System.out.println("What would you like to do?");
            System.out.println(SEPARATOR);
            System.out.println("1. Deposit Money.");
            System.out.println("2. Withdraw Money.");
            System.out.println("3. Get Balance.");
            System.out.println("4. View Account Details.");
            System.out.println("5. Exit.");
            System.out.print("Choice: ");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.println("How much money would you like to deposit?");
                    System.out.print("Amount: ");
                    amount=sc.nextInt();
                    account.deposit(amount);
                    break;
                case 2:
                    System.out.println("How much money would you like to withdraw?");
                    System.out.print("Amount: ");
                    amount=sc.nextInt();
                    account.withdraw(amount);
                    break;
                case 3:
                    System.out.println("Your current Balance is : " + account.getBalance());
                    break;
                case 4:
                    account.displayDetails();
                    break;
                case 5:
                    System.out.println("Session Terminated!");
                    break;
                default:
                    System.out.println("Please choose a valid option.");
            }
        }while(choice!=5);

    }

}

class Account{
    private long accountNumber;
    private String accountHolderName;
    private int balance;
    private static final String BANK_NAME="State Bank";
    private static int totalAccounts; 
    private static final String SEPARATOR="****************************************************";

    static{
        System.out.println("Welcome to " + BANK_NAME.toUpperCase());
    }

    public static void showBankInfo(){
        System.out.println(SEPARATOR);
        System.out.println("Hey! We are the " + BANK_NAME.toUpperCase() + "!");
        System.out.println("We have a total number of " + totalAccounts + " user accounts!");
        System.out.println(SEPARATOR);
    }

    public Account(String accountHolderName){
        balance=0;
        accountNumber=(long)(Math.random()*100000000);
        this.accountHolderName=accountHolderName;
        totalAccounts++;
    }

    public static int getTotalAccounts(){
        return totalAccounts;
    }

    public void deposit(int amount){
        if(amount<=0){
            System.out.println(SEPARATOR);
            System.out.println("Deposit amount cannot be Negative or Zero!");   
            System.out.println(SEPARATOR); 
        }
        else{
            balance+=amount;
            System.out.println(SEPARATOR);
            System.out.println("₹" + amount + " deposited successfully");
            System.out.println(SEPARATOR);
        }
    }

    public void withdraw(int amount){
        if(amount<=0){
            System.out.println(SEPARATOR);
            System.out.println("Zero and Negative amount cannot be withdrawn!");
            System.out.println(SEPARATOR);
        }
        else if(amount>balance){
            System.out.println(SEPARATOR);
            System.out.println("You don't have sufficient funds to withdraw!");
            System.out.println(SEPARATOR);
        }
        else{
            balance-=amount;
            System.out.println(SEPARATOR);
            System.out.println("₹" + amount + " withdrawn successfully!");
            System.out.println(SEPARATOR);
        }
    }
    
    public int getBalance(){
        return balance;
    }

    public void displayDetails(){ 
        System.out.println("Account Details");
        System.out.println(SEPARATOR);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Balance: " + balance);
        System.out.println(SEPARATOR);
    }
}

public class BankApp {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("What Would you like to do?");
            System.out.println("1. Create an Account.");
            System.out.println("2. Know about the Bank.");
            System.out.println("3. Nothing.");
            System.out.print("Choice: ");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    Session m = new Session();
                    m.startSession(sc);
                    break;
                case 2:
                    Account.showBankInfo();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Please Choose a valid Option.");
            }
        }while(choice!=3);

        sc.close();
    }
}
