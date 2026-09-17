/*
Input a String and calculate:

length
number of vowels
number of consonants
number of digits
number of spaces
number of special characters
uppercase count
lowercase count
 */

import java.util.Scanner;

class Operations{
    private String str;

    public void setString(String str){
        this.str=str;
    }

    private boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            return true;
        return false;
    }

    private int numberOfVowels(){
        int count=0;
        String str1=str.toLowerCase();

        for(int i=0; i<str1.length(); i++){
            if(isVowel(str1.charAt(i)))
                count++;
        }

        return count;
    }

    private int numberOfConsonants(){
        int count=0;
        String str1=str.toLowerCase();

        for(int i=0; i<str1.length(); i++){
            if((!isVowel(str1.charAt(i))) && (str1.charAt(i)>='b' && str1.charAt(i)<='z'))
                count++;
        }

        return count;
    }
   
    private int numberOfDigits(){
        int count=0;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)>='0' && str.charAt(i)<='9')
                count++;
        }

        return count;
    }

    private int numberOfSpaces(){
        int count=0;
        
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==' ')
                count++;
        }

        return count;
    }

    private int numberOfSpecialCharacters(){
        int count=0;

        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            if(!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch))
                count++;
        }

        return count;
    }

    private int numberOfUppercases(){
        int count=0;
        
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)>='A' && str.charAt(i)<='Z')
                count++;
        }

        return count;
    }

    private int numberOfLowercases(){
        int count=0;
        
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)>='a' && str.charAt(i)<='z')
                count++;
        }

        return count;
    }

    public void showDetails(){
        System.out.println("String: " + str);
        System.out.println("Length Of String: " + str.length());
        System.out.println("Count of Vowels: " + numberOfVowels());
        System.out.println("Count of Consonants: " + numberOfConsonants());
        System.out.println("Count of Digits: " + numberOfDigits());
        System.out.println("Count of Spaces: " + numberOfSpaces());
        System.out.println("Count of SpecialCharacters: " + numberOfSpecialCharacters());
        System.out.println("Count of Uppercase Characters: " + numberOfUppercases());
        System.out.println("Count of Lowercase Characters: " + numberOfLowercases());
    }

}

public class StringAnalyzer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str=sc.nextLine();

        Operations op=new Operations();
        op.setString(str);
        op.showDetails();

        sc.close();
    }
}
