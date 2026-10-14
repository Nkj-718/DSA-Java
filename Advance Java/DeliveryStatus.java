enum OrderStatus{
    PLACED, SHIPPED, DELIVERED, CANCELLED;
}

class DeliveryStatus {
    public static void main(String[] args) {
        OrderStatus status=OrderStatus.PLACED;
        // OrderStatus status=OrderStatus.SHIPPED;
        // OrderStatus status=OrderStatus.DELIVERED;
        // OrderStatus status=OrderStatus.CANCELLED;

        if(status==OrderStatus.PLACED)
            System.out.println("Order has been placed.");
        else if(status==OrderStatus.SHIPPED)
            System.out.println("The Order has been shipped.");
        else if(status==OrderStatus.DELIVERED)
            System.out.println("Order has been delivered.");
        else
            System.out.println("The order was successfully cancelled.");
    }
}
