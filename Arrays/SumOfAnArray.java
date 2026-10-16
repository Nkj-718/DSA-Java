import java.util.Scanner;

class SumOfAnArray {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter size of the array: ");
        int n=sc.nextInt();
        int sum=0;
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            System.out.print("Enter element " + i + ": ");
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        System.out.println("Sum of the given array: " + sum);

        sc.close();
    }
}
