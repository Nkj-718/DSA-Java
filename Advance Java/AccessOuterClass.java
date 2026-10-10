class OuterClass{
    private int count=0;

    class InnerClass{
        public void incrementCount(){
            count++;
        }

        public void showCount(){
            System.out.println("Count: " + count);
        }
    }
    
}

class AccessOuterClass{
    public static void main(String[] args) {
        OuterClass outerClass=new OuterClass();
        OuterClass.InnerClass innerClass=outerClass.new InnerClass();
        innerClass.incrementCount();
        innerClass.incrementCount();
        innerClass.incrementCount();
        innerClass.showCount();
    }
}