class IntegerMethod {
    public static void main(String[] args) {
        Integer num1=100;
        Integer num2=200;
        int num3=num1;
        Integer num4=200;
        System.out.println(num1 == num2);
        System.out.println(num1.equals(num3));
        System.out.println(num1.toString() + num2);
        System.out.println(num1 + num2);
        System.out.println(num3);
        System.out.println(num1.doubleValue());
        System.out.println("Equality Operator result: " + (num2==num4)); //Compares references.
        System.out.println("equals Method result: " + (num2.equals(num4))); //Compares values.
    }    
}
