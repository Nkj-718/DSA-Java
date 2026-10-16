import java.util.Scanner;

class ReverseArray {
     public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter size of the array: ");
        int n=sc.nextInt();
        int[] arr1=new int[n];
        int[] arr2=new int[n];
        for(int i=0;i<arr1.length;i++)
        {
            System.out.print("Enter element " + i + ": ");
            arr1[i]=sc.nextInt();
            arr2[(n-i-1)]=arr1[i];
        }
        System.out.println("Reversed Array:-");
        for (int i=0;i<arr2.length;i++) {
            System.out.println(arr2[i] + "\t");   
        }

        sc.close();
    }
}