abstract class Runnable {
    public abstract void run();
}

class RunnablePractice{
    public static void main(String[] args) {
        Runnable r=new Runnable(){
            @Override 
            public void run(){
                System.out.println("Program Running...");
            }
        };

        r.run();
    }
}