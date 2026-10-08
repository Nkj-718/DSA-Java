interface Animal{
    void sound();
}

class AnimalSounds {
    public static void main(String[] args) {
        Animal dog=new Animal(){
            @Override
            public void sound(){
                System.out.println("Dog barks.");
            }
        };

        Animal cat=new Animal(){
            @Override 
            public void sound(){
                System.out.println("Cat meows.");
            }
        };

        dog.sound();
        cat.sound();
    }    
}
