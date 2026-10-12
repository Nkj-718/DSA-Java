class BankAccount{
    private double balance=1000;

    public BankAccount(){
        System.out.println("Account created successfully!");
        System.out.println("Balance: $" + balance);
    }

    class Transaction{
        public void deposit(double amount){
            if(amount>0){
                balance+=amount;
                System.out.println();
                System.out.println("Amount $" + amount + " has been deposited successfully!");
                System.out.println("Balance: $" + balance);
                System.out.println();
            }
            else{
                System.out.println("Error! Deposit amount cannot be zero or negative.");
            }
        }

        public void withdraw(double amount){

            if(amount>0 && amount<=balance){
                balance-=amount;
                System.out.println();
                System.out.println("Amount $" + amount + " has been withdrawn successfully!");
                System.out.println("Balance: $" + balance);
                System.out.println();
            }
            else if(amount<=0){
                System.out.println("Error! Withdraw amount cannot be zero or lower.");
            }
            else{
                System.out.println("Error! Withdraw amount exceeds account balance.");
            }
        }
    }
}

class BankAccountAndTransaction {
    public static void main(String[] args) {
        BankAccount acc=new BankAccount();
        BankAccount.Transaction transaction=acc.new Transaction();
        transaction.withdraw(500);
        transaction.deposit(1500);
        transaction.withdraw(5000);
        transaction.withdraw(1300);
    }
}
