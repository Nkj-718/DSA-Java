package questions;

public class Question {
    private String question;
    private String[] options=new String[4];
    private int correctOption;
    private int marks;
    private int penalty;

    public Question(String question, String[] options, int correctOption, int marks, int penalty){
        this.question=question;
        this.options=options;
        this.correctOption=correctOption;
        this.marks=marks;
        this.penalty=penalty;
    }

    public void setQuestion(String question){
        this.question=question;
    }

    public String getQuestion(){
        return question;
    }

    public void setOption1(String option){
        this.options[0]=option;
    }
    
    public String getOption1(){
        return options[0];
    }

    public void setOption2(String option){
        this.options[1]=option;
    }
    
    public String getOption2(){
        return options[1];
    }
    
    public void setOption3(String option){
        this.options[2]=option;
    }

    public String getOption3(){
        return options[2];
    }

    public void setOption4(String option){
        this.options[3]=option;
    }
    
    public String getOption4(){
        return options[3];
    }

    public String[] getOptions(){
        return options;
    }

    public String getOptionsString(){
        return "[ " + options[0] + ", " + options[1] + ", " + options[2] + ", " + options[3] + " ]";
    }
    
    public void setCorrectOption(int correctOption) {
        this.correctOption=correctOption;
    }
    
    public int getCorrectOption(){
        return correctOption;
    }
    
    public void setMarks(int marks) {
        this.marks=marks;
    }
    
    public int getMarks(){
        return marks;
    }

    public void setPenalty(int penalty) {
        this.penalty=penalty;
    }

    public int getPenalty(){
        return penalty;
    }

}
