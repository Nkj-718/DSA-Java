class WrapperClassConversion {
    public static void main(String[] args) {
        String num1="45";
        Integer num2=Integer.valueOf(num1); //Using Integer wrapper class.
        int num3=num2; //auto-unboxing.
        double num4=num2.doubleValue();
        double result=num4*2.5;

        System.out.println("String: " + num1);
        System.out.println("Integer: " + num2);
        System.out.println("int: " + num3);
        System.out.println("Double: " + num4);
        System.out.println(num4 + " * 2.5 = " + result);
    }    
}
