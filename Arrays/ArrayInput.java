import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr=new int[n];
        System.out.println();
        for (int i=0; i<n; i++) {
            System.out.print("Enter element " + i + ": ");
            arr[i]=sc.nextInt();
        }
        System.out.println("Array:-");
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + "\t");
        }

        sc.close();
    }

}