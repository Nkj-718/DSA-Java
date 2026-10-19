import java.util.Scanner;

public class ArrayMerge {
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
        int[] result=new int[arr1.length + arr2.length];
        for(int i=0,j=0;i<result.length;i++)
        {
            if(i<arr1.length)
            {
                result[i]=arr1[i];
            }
            else
            {
                result[i]=arr2[j];
                j++;
            }
        }
        System.out.println("Resultant Array:-");
        for (int i=0;i<result.length;i++) {
            System.out.print(result[i] + "\t");
        }

        sc.close();
    }
}