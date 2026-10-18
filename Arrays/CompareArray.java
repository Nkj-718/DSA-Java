class CompareArray {
    public static void main(String[] args) {
        int[] arr1={4,5,8,9};
        int[] arr2={4,5,8,9};
        boolean comparison=java.util.Arrays.equals(arr1,arr2);
        if(comparison==true)
        {
            System.out.println("Both the arrays are equal!");
        }
        else
        {
            System.out.println("Both the arrays are NOT equal!");
        }
    }
}