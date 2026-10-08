class Car{
    private String brand="Porsche";
    private String model="Turbo S";

    class Engine{
        private int horsepower=640;

        public void showCarInfo(){
            System.out.println(brand + " " + model + " : " + horsepower + " HP");
        }
    }
}

class CarAndEngine{
    public static void main(String[] args) {
        Car obj=new Car();
        Car.Engine obj1=obj.new Engine();
        obj1.showCarInfo();
    }
}


