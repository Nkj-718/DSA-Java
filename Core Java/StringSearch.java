import java.util.Scanner;

class Operations{
    private String str;
    char ch;
    String substring;
    char newCh;
    int startIndex; 
    int endIndex; 
    String startWord;
    String endWord;
    char oldCh;

    public void setValues(String str, char ch, String substring, char newCh, int startIndex, int endIndex, String startWord, String endWord, char oldCh){
        this.str=str;
        this.ch=ch;
        this.substring=substring;
        this.newCh=newCh;
        this.startIndex=startIndex;
        this.endIndex=endIndex;
        this.startWord=startWord;
        this.endWord=endWord;
        this.oldCh=oldCh;
    }

    public String reverseString(){
        StringBuilder newStr = new StringBuilder();

        for(int i=str.length()-1; i>=0; i--){
            newStr.append(str.charAt(i));
        }

        return newStr.toString();
    }

    public void showDetails(){
        System.out.println("Original String: " + str);
        System.out.println();
        System.out.println("Character '" + ch + "' found: " + str.contains(Character.toString(ch)));
        System.out.println("Substring \"" + substring + "\" found: " + str.contains(substring));
        System.out.println();
        System.out.println("First Occurence of '" + ch + "': " + str.indexOf(ch));
        System.out.println("Last Occurence of '" + ch + "': " + str.lastIndexOf(ch));
        System.out.println();
        System.out.println("After replacing '" + oldCh + "' with '" + newCh + "': " + str.replace(oldCh, newCh));
        System.out.println("Extracted substring: " + str.substring(startIndex, endIndex+1));
        System.out.println();
        System.out.println("Starts with \"" + startWord + "\":" + str.startsWith(startWord));
        System.out.println("Ends with \"" + endWord + "\":" + str.endsWith(endWord));
        System.out.println();
        System.out.println("Reversed String: " + reverseString());
    }

}

public class StringSearch{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str=sc.nextLine();
        System.out.print("Enter a character to search: ");
        char ch=sc.next().charAt(0);
        sc.nextLine();
        System.out.print("Enter a substring to search: ");
        String substring=sc.nextLine();
        System.out.print("Enter starting index for substring extraction: ");
        int startIndex=sc.nextInt();
        System.out.print("Enter ending index for substring extraction: ");
        int endIndex=sc.nextInt();
        System.out.print("Enter character to replace: ");
        char oldCh=sc.next().charAt(0);
        System.out.print("Enter replacement character: ");
        char newCh=sc.next().charAt(0);
        System.out.println();
        System.out.print("Check if the string begins with the word: ");
        String startWord=sc.next();
        System.out.print("Check if the string ends with the word: ");
        String endWord=sc.next();

        Operations op=new Operations();
        op.setValues(str, ch, substring, newCh, startIndex, endIndex, startWord, endWord, oldCh);
        op.showDetails();

        sc.close();
    }
}
