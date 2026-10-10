interface Animal{
    void sound(String name);
}

public class AnonymousAnimal {
    public static void main(String[] args) {
        Animal dog=new Animal(){

            @Override 
            public void sound(String name){
                System.out.println(name + " is barking!");
            }
        };

        Animal cat=new Animal(){

            @Override 
            public void sound(String name){
                System.out.println(name + " is meowing!");
            }
        };

        dog.sound("Bruno");
        cat.sound("Zac");
        dog.sound("Rocky");
        cat.sound("John");
    }

}
