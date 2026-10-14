enum TicketType{
    CHILD(100), ADULT(250), SENIOR(150);

    private int price;

    TicketType(int price){
        this.price=price;
    }

    int getPrice(){
        return this.price;
    }
}

class TicketPricing {
    public static void main(String[] args) {
        
        TicketType ticket=TicketType.SENIOR;

        System.out.println(ticket.name() + ": $" + ticket.getPrice());
    }
}
