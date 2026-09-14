import java.util.Scanner;
import java.util.Arrays;

class ArrayOperations{
    private int[] arr;

    public ArrayOperations(int[] arr){
        this.arr=arr;
    }

    public int calculateSum(){
        int sum=0;
        for(int i : arr)
            sum+=i;
        return sum;
    }

    public int findLargestElement(){
        int max=arr[0];

        for(int i : arr){
            max = (max<i) ? i : max;
        }

        return max;
    }

    public int findSmallestElement(){
        int min=arr[0];

        for(int i : arr){
            min = (min>i) ? i : min;
        }

        return min;
    }

    public int[] reverseArray(){
        int[] reverse = new int[arr.length];
        for(int i=0, j=arr.length-1; i<=arr.length/2; i++, j--){
            reverse[i]=arr[j];
            reverse[j]=arr[i];
        }

        return reverse;
    }

    public void showDetails(){
        System.out.println("Array Details:-");
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Size: " + arr.length);
        System.out.println("Sum of elements: " + calculateSum());
        System.out.println("Largest Element: " + findLargestElement());
        System.out.println("Smallest Element: " + findSmallestElement());
        System.out.println("Reverse Array: " + Arrays.toString(reverseArray()));

    }

}

public class ArrayStatistics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        byte size = sc.nextByte();

        if(size>0){
            int[] arr = new int[size];
        
            System.out.println("Enter elements:");
            for(int i=0; i<size; i++)
                arr[i]=sc.nextInt();

            ArrayOperations a = new ArrayOperations(arr);
            a.showDetails();
        }
        else if(size==0)
            System.out.println("The array has 0 elements!");
        else
            System.out.println("Invalid! An array can't have negative number of elements.");

        sc.close();
    }    
}
