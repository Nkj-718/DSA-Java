import java.util.Scanner;

public class CompareUserArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number of elements in Array 1: ");
        int n=sc.nextInt();
        int[] arr1=new int[n];
        System.out.println("Enter " + n + " elements: ");
        for (int i=0;i<n;i++) {
            arr1[i]=sc.nextInt();
        }
        System.out.print("Enter the number of elements in Array 2: ");
        int m=sc.nextInt();
        int[] arr2=new int[m];
        System.out.println("Enter " + m + " elements: ");
        for (int i=0;i<m;i++) {
            arr2[i]=sc.nextInt();
        }
        boolean comparison=java.util.Arrays.equals(arr1,arr2);
        if(comparison==true)
        {
            System.out.println("Both the arrays are equal!");
        }
        else
        {
            System.out.println("Both the arrays are NOT equal!");
        }

        sc.close();
    }
}