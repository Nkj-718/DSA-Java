interface Payment{
    void pay(double amount);
}

class PaymentMehods {
    public static void main(String[] args) {
         Payment upi=new Payment(){
            public void pay(double amount){
                System.out.println("Paid $" + amount + " using UPI.");
            }
        };

        Payment cash=new Payment(){
            public void pay(double amount){
                System.out.println("Paid $" + amount + " using Cash.");
            }
        }; 
        
        upi.pay(500);
        cash.pay(800);
    }

}
