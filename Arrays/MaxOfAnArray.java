import java.util.Scanner;

public class MaxOfAnArray {
   public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter size of the array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            System.out.print("Enter element " + i + ": ");
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for (int i=1;i<arr.length;i++) {
            if(arr[i]>max)
               max=arr[i];
        }
        System.out.println("Greatest element in the array: " + max);

        sc.close();
    }
}