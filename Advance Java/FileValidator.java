interface Validator{
    boolean isValid(String fileName);
}


class FileValidator {
    public static void main(String[] args) {
        Validator textValidator=new Validator(){
            public boolean isValid(String fileName){
                if(fileName.endsWith(".txt"))
                    return true;
                return false;
            }
        };

        Validator javaFileValidator=new Validator(){
            public boolean isValid(String fileName){
                if(fileName.endsWith(".java"))
                    return true;
                return false;
            }
        };

        String file1="notes.txt";
        String file2="Main.java";

        System.out.println("Hello! Welcome to File Validator!");

        System.out.println("Text Validator:");
        System.out.println(file1 + " : " + textValidator.isValid(file1));
        System.out.println(file2 + " : " + textValidator.isValid(file2));

        System.out.println();
        
        System.out.println("Java File Validator:");
        System.out.println(file1 + " : " + javaFileValidator.isValid(file1));
        System.out.println(file2 + " : " + javaFileValidator.isValid(file2));
    }   
}
