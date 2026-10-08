class Person{
    private String name="ABC";

    class Address{
        private String location="Ward-123, Mumbai";
        
        public void showPersonData(){
            System.out.println("Name: " + name);
            System.out.println("Location: " + location);
        }
    }
}

class PersonLocation {
    public static void main(String[] args) {
        Person p=new Person();
        Person.Address obj=p.new Address();
        obj.showPersonData();
        
    }
}
