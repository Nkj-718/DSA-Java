import java.util.Scanner;

public class CopyArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter the number of elements in Array 1: ");
        int n=sc.nextInt();
        int[] arr1=new int[n];
        System.out.println("Enter " + n + " elements: ");
        for (int i=0;i<n;i++) {
            arr1[i]=sc.nextInt();
        }
        int[] arr2=new int[arr1.length];
        for(int i=0;i<arr1.length;i++)
        {
            arr2[i]=arr1[i];
        }
        System.out.println("Array 2:- ");
        for(int i=0;i<arr2.length;i++)
        {
            System.out.print(arr2[i] + "\t");
        }

        sc.close();
    }
}