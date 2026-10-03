package quizService;

import questions.Question;
import users.*;
import java.util.Scanner;

public class QuizService {
    private Question[] questions=new Question[100];
    private int questionCount;
    private char[] userAnswers=new char[100];

    public QuizService(){
        this.questionCount=0;
        questions[questionCount++]=new Question("When was Java Created?", new String[]{"1991", "1989", "1995", "1987"}, 0, 2, 1);
        questions[questionCount++]=new Question("When Java was originally created, what was its name?", new String[]{"Java", "Green Project", "Gosling", "Oak"}, 3, 4, 1);
        questions[questionCount++]=new Question("What was the inspiration for the name 'Java'?", new String[]{"Cat", "Coffee", "Wood", "Chocolate"}, 1, 3, 1);
        questions[questionCount++]=new Question("When was it officially rebranded as Java?", new String[]{"1991", "1994", "1995", "1990"}, 2, 2, 2);
        questions[questionCount++]=new Question("When was Java's first Stable version(JDK 1.0) released?", new String[]{"1992", "1995", "1988", "1996"}, 3, 5, 2);
    }

    public void addQuestion(Scanner sc){
        if(questionCount >= questions.length){
            System.out.println("Question limit reached!");
            return;
        }

        System.out.println("Enter Question: ");
        sc.nextLine();
        String question=sc.nextLine();
        System.out.print("Option A: ");
        String option1=sc.nextLine();
        System.out.print("Option B: ");
        String option2=sc.nextLine();
        System.out.print("Option C: ");
        String option3=sc.nextLine();
        System.out.print("Option D: ");
        String option4=sc.nextLine();

        int correctOption;
        do{
            System.out.print("Enter correct Option number (1-4): ");
            correctOption=sc.nextInt();
        }while(correctOption<1 || correctOption>4);

        System.out.print("Enter number of points rewarded for correctly answering the question: ");
        int marks=sc.nextInt();

        System.out.print("Enter number of points deducted for incorrectly answering the question: ");
        int penalty=sc.nextInt();

        questions[questionCount++]=new Question(question, new String[]{option1, option2, option3, option4}, correctOption-1, marks, penalty);
    }

    private void showQuestions(){
        for(int i=0; i<questionCount; i++){
            System.out.println("------------------------------------------------------");
            System.out.println((i+1) + ". " + questions[i].getQuestion());
            System.out.println("Options: " + questions[i].getOptionsString());
            System.out.println("Reward: " + questions[i].getMarks() + "     Penalty: " + questions[i].getPenalty());
            System.out.println("------------------------------------------------------");
            System.out.println();
        }
    }

    private Question chooseQuestion(Scanner sc){
        System.out.println("Question List:");
        showQuestions();
        int choice;
        do{
            System.out.print("Enter the number of Question you want to edit: ");
            choice=sc.nextInt();

            if(choice<1 || choice>questionCount){
                System.out.println("\nInvalid Question number! Please choose a question to edit (1-" + questionCount + ").");
            }
        }while(choice<1 || choice>questionCount);

        return questions[choice-1];

    }

    public void editQuestion(Scanner sc){
        Question question=chooseQuestion(sc);
        
        while(true){
            int choice;
            do{
                System.out.println("Question: " + question.getQuestion());
                System.out.println("Options: " + question.getOptionsString());
                System.out.println("Reward: " + question.getMarks() + "     Penalty: " + question.getPenalty());

                System.out.println("\nWhat do you want to edit?");
                System.out.println("1. Question Statement");
                System.out.println("2. Option A    3. Option B    4. Option C    5. Option D");
                System.out.println("6. Points Rewarded    7. Points Deducted");
                System.out.println("8. Correct Option");
                System.out.print("Choice: ");
                choice=sc.nextInt();
                sc.nextLine();

                if(choice<1 || choice>8)
                    System.out.println("\nInvalid Input! Please try again.\n");
            }while(choice<1 || choice>8);

            switch(choice){
                case 1:
                    System.out.println("Enter Question Statement:");
                    String questionStatement=sc.nextLine();
                    question.setQuestion(questionStatement);
                    break;
                case 2:
                    System.out.print("Enter Option Statement: ");
                    String option1=sc.nextLine();
                    question.setOption1(option1);
                    break;
                case 3:
                    System.out.print("Enter Option Statement: ");
                    String option2=sc.nextLine();
                    question.setOption2(option2);
                    break;
                case 4:
                    System.out.print("Enter Option Statement: ");
                    String option3=sc.nextLine();
                    question.setOption3(option3);
                    break;
                case 5:
                    System.out.print("Enter Option Statement: ");
                    String option4=sc.nextLine();
                    question.setOption4(option4);
                    break;
                case 6:
                    System.out.print("Enter the number of points to be rewarded upon giving the correct answer: ");
                    int reward=sc.nextInt();
                    question.setMarks(reward);
                    break;
                case 7:
                    System.out.print("Enter the number of points to be deducted upon giving an incorrect answer: ");
                    int penalty=sc.nextInt();
                    question.setPenalty(penalty);
                    break;
                case 8:
                    int correctOption;
                    do {
                        System.out.print("Choose the correct option (1-4): ");
                        correctOption=sc.nextInt();
                    
                        if(correctOption<1 || correctOption>4) {
                            System.out.println("Invalid option. Please choose 1-4.");
                        }
                    
                    }while(correctOption<1 || correctOption>4);
                    question.setCorrectOption(correctOption-1);
                    break;

            }

            System.out.println("\nDo you want to stop editing the question?");
            System.out.println("1. Yes");
            System.out.print("Choice: ");
            int continueEditing=sc.nextInt();
            if(continueEditing==1){
                System.out.println("\nExiting Edit Menu...\n");
                return;
            }
        }
        
    }

    private void checkAnswers(Player player, char[] userAnswers){
        for(int i=0; i<questionCount; i++){
            String userAnswer=null;
            if(userAnswers[i]=='A'){
                userAnswer=questions[i].getOption1();
            }
            else if(userAnswers[i]=='B'){
                userAnswer=questions[i].getOption2();
            }
            else if(userAnswers[i]=='C'){
                userAnswer=questions[i].getOption3();
            }
            else if(userAnswers[i]=='D'){
                userAnswer=questions[i].getOption4();
            }

            if(userAnswer.equals(questions[i].getOptions()[questions[i].getCorrectOption()]))
                player.updatePlayerScore(questions[i].getMarks(), "Reward");
            else
                player.updatePlayerScore(questions[i].getPenalty(), "Penalty");
        }
    }

    public void playQuiz(Player player, Scanner sc){
        System.out.println("Booting up the Quiz!");
        System.out.println();

        for(int i=0; i<questionCount; i++){
            System.out.println("Question " + (i+1) + ": " + questions[i].getQuestion());
            System.out.println("A. " + questions[i].getOption1() + "    B. " + questions[i].getOption2());
            System.out.println("C. " + questions[i].getOption3() + "    D. " + questions[i].getOption4());
            System.out.println();
            char answer;
            do{
                System.out.print("Answer (A-D): ");
                answer=Character.toUpperCase(sc.next().charAt(0));
            
                if(answer<'A' || answer>'D'){
                    System.out.println("\nInvalid answer! Please enter A, B, C or D.\n");
                }
            }while(answer<'A' || answer>'D');

            userAnswers[i] = answer;
        }

        checkAnswers(player, userAnswers);
        System.out.println("Your[" + player.getUserName() + "] Score is: " + player.getPlayerScore());
    }

}
