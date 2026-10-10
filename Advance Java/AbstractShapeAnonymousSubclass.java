abstract class Shape{

    public abstract double calculateArea();
}

class AbstractShapeAnonymousSubclass{
    public static void main(String[] args) {
        Shape shape=new Shape(){
            double radius=5;

            public double calculateArea(){
                return (Math.PI * (radius*radius));
            }
        };

        System.out.println("Area: " + shape.calculateArea());
    }
}