class CommonElements {
    public static void main(String[] args) {
        int[] arr1={3,4,7,5,8,9};
        int[] arr2={3,2,7,2,9};
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
    }
}