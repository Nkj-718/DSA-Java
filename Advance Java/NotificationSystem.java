interface Notification{
    void send(String message);
}

class NotificationSystem {
    public static void main(String[] args) {
        Notification email=new Notification(){
            public void send(String message){
                System.out.println("Email: " + message);
            }
        };

        Notification sms=new Notification(){
            public void send(String message){
                System.out.println("SMS: " + message);
            }
        };

        email.send("Your order has been shipped!");
        sms.send("Your order has been shipped!");
    }
}
