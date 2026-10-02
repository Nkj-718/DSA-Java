package questions;

public class Question {
    private String question;
    private String[] options=new String[4];
    private String correctOption;

    public Question(String question, String[] options, String correctOption){
        this.question=question;
        this.options=options;
        this.correctOption=correctOption;
    }

    public String getQuestion(){
        return question;
    }

    public String getOption1(){
        return options[0];
    }

    public String getOption2(){
        return options[1];
    }

    public String getOption3(){
        return options[2];
    }

    public String getOption4(){
        return options[3];
    }

    public String getCorrectOption(){
        return correctOption;
    }

}
