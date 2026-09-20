import java.util.Scanner;

class Data{

    public double averageMarks(Student[] s){
        int total=0;
        for(Student i : s){
            total+=i.getMarks();
        }

        return (double) total/s.length;
    }

    public Student lowestScore(Student[] s){
        Student lowest=s[0];
        for(Student i : s){
            if(i.getMarks()<lowest.getMarks())
                lowest=i;
        }
        return lowest;
    }

    public Student highestScore(Student[] s){
        Student highest=s[0];
        for(Student i : s){
            if(i.getMarks()>highest.getMarks())
                highest=i;
        }
        return highest;
    }

    public int passedStudents(Student[] s){
        int count=0;

        for(Student i : s){
            if(i.getMarks()>=40)
                count++;
        }

        return count;
    }

}

class Student{
    private String name;
    private int roll;
    private int marks;

    public void setData(String name, int roll, int marks){
        this.name=name;
        this.roll=roll;
        this.marks=marks;
    }

    public String getName(){
        return name;
    }

    public int getRoll(){
        return roll;
    }

    public int getMarks(){
        return marks;
    }

}

public class StudentDatabase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("How many students?: ");
        int n=sc.nextInt();

        System.out.println();

        Student[] s=new Student[n];

        String name="";
        int roll=0;
        int marks=0;

        for(int i=0; i<s.length; i++){
            System.out.println("Student " + (i+1) + ":-");
            System.out.print("Name: ");
            name=sc.next();
            System.out.print("Roll: ");
            roll=sc.nextInt();
            System.out.print("Marks: ");
            marks=sc.nextInt();

            s[i]=new Student();
            s[i].setData(name, roll, marks);

            System.out.println();
        }

        for(Student i : s){
            System.out.println(i.getRoll() + "." + i.getName() + ": " + i.getMarks());
        }

        Data d=new Data();
        System.out.println("Average Marks: " + d.averageMarks(s));
        Student lowestScoringStudent=d.lowestScore(s);
        System.out.println("Lowest Scorer: " + lowestScoringStudent.getName() + ": " + lowestScoringStudent.getMarks());
        Student highestScoringStudent=d.highestScore(s);
        System.out.println("Highest Scorer: " + highestScoringStudent.getName() + ": " + highestScoringStudent.getMarks());
        System.out.println("Passed: " + d.passedStudents(s));
        System.out.println("Failed: " + (s.length-d.passedStudents(s)));

        sc.close();
    }
}
