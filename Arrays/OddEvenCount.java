import java.util.Scanner;

public class OddEvenCount {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter size of the array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        int even=0,odd=0,zeroes=0;
        for(int i=0;i<arr.length;i++)
        {
            System.out.print("Enter element " + i + ": ");
            arr[i]=sc.nextInt();
            if(arr[i]%2==0 && arr[i]!=0)
                even++;
            else if(arr[i]%2==1) 
                odd++;
            else
                zeroes++;          
        }
        System.out.println("Even elements in the array: " + even);
        System.out.println("Odd elements in the array: " + odd);
        System.out.println("Zeroes in the array: " + zeroes);

        sc.close();
    }
}