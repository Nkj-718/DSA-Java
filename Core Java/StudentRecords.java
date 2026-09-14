class Student{

    private String name;
    private double marks;
    private int roll;
    private byte total=70;

    public Student(String name, double marks, int roll){
        this.name=name;
        this.marks=marks;
        this.roll=roll;
    }

    public double calculatePercentage(){
        return (marks*100)/total;
    }

    public boolean isPass(){
        return ((calculatePercentage())>=40);
    }

    public void showData(){
        System.out.println("Roll No.: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks + " / " + total);
        System.out.println("Percentage: " + calculatePercentage() + " %");
        System.out.println("Has Passed?: " + isPass());
    }
}

class StudentRecords{
    public static void main(String[] args) {
        Student st1 = new Student("Aakash", 55.0, 1);
        Student st2 = new Student("Farhan", 64.0, 13);
        Student st3 = new Student("John", 27.0, 45);

        System.out.println("Student Data:- ");
        st1.showData();
        st2.showData();
        st3.showData();
    }
}