enum Operations{
    ADDITION, SUBTRACTION, MULTIPLICATION, DIVISION;
}

class EnumCalculator {
    public static void main(String[] args) {
        Operations op=Operations.ADDITION;            
        // Operations op=Operations.SUBTRACTION;            
        // Operations op=Operations.MULTIPLICATION;            
        // Operations op=Operations.DIVISION;            
        
        double num1=20;
        double num2=5;

        switch(op){
            case ADDITION:
                System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
                break;
            case SUBTRACTION:
                System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
                break;
            case MULTIPLICATION:
                System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
                break;
            default:
                if(num2!=0)
                    System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
                else
                    System.out.println("ZERO DIVISION");
                break;
        }
    }
}
