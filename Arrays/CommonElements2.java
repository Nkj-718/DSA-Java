import java.util.Scanner;

class CommonElements2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number of elements in array1: ");
        int n=sc.nextInt();
        int[] arr1=new int[n];
        System.out.println("Enter " + n + " elements:- ");
        for (int i=0;i<arr1.length;i++) 
        {
            arr1[i]=sc.nextInt();  
        }
        System.out.print("Enter the number of elements in array2: ");
        int m=sc.nextInt();
        int[] arr2=new int[m];
        System.out.println("Enter " + m + " elements:- ");
        for (int i=0;i<arr2.length;i++) 
        {
            arr2[i]=sc.nextInt();  
        }
        System.out.println("Common Elements:-");
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr2.length;j++)
            {
                if(arr1[i]==arr2[j])
                {
                    System.out.print(arr2[j] + "\t");
                }
            }
        }

        sc.close();
    }
}