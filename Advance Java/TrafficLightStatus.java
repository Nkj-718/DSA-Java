enum TrafficLight{
    RED, YELLOW, GREEN;
}

class TrafficLightStatus {
    public static void main(String[] args) {
        TrafficLight status=TrafficLight.RED;
        System.out.println("Current Status: " + status);
        
        status=TrafficLight.YELLOW;
        System.out.println("Current Status: " + status);

        status=TrafficLight.GREEN;
        System.out.println("Current Status: " + status);
    }
}
