import java.util.Scanner;

class ArrayMerge2 {

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
        for(int i=0,j=0,k=0;i<result.length;i++)
        {
            if(i%2==0 && j<arr1.length)
            {
                result[i]=arr1[j];
                j++;
            }
            else if(i%2==0 && j>=arr1.length && k<arr2.length)
            {
                result[i]=arr2[k];
                k++;
            }
            else if(i%2==1 && k<arr2.length)
            {
                result[i]=arr2[k];
                k++;
            }
            else if(i%2==1 && k>=arr2.length && j<arr1.length)
            {
                result[i]=arr1[j];
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
    
