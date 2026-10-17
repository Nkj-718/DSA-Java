import java.util.Scanner;

public class LinearSearch {
     public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter size of the array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        int found=-1;
        for(int i=0;i<arr.length;i++)
        {
            System.out.print("Enter element " + i + ": ");
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter element to be searched for: ");
        int key= sc.nextInt();
        for (int i=0;i<arr.length;i++) {
            if(arr[i]==key)
            {
                found=i;
                break;
            }   
        }
        if(found!=-1)
        {
            System.out.println("Element found at index: " + found);
        }
        else
        {
            System.out.println("Element not found!");
        }

        sc.close();
    }
}