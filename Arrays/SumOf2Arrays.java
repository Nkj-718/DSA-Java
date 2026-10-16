import java.util.Scanner;

class SumOfTwoArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int sum=0;
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
        int track;
        if(m>n)
           track=m;
        else
           track=n;
        for (int i=0;i<track;i++) {
            if(i<arr1.length)
            {
                sum+=arr1[i];
            }
            if (i<arr2.length) {
                sum+=arr2[i];
            }
        }
        System.out.print("The combined sum of elements in both arrays is " + sum);

        sc.close();
    }
}
