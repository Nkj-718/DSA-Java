import java.util.Scanner;

public class MaxFrom2Arrays {
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
        int max=arr1[0];
        for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i]>max)
            {
                max=arr1[i];
            }
        }
        for(int i=0;i<arr2.length;i++)
        {
            if(arr2[i]>max)
            {
                max=arr2[i];
            }
        }
        System.out.println("Maximum element in both the arrays: " + max);

        sc.close();
    }
}