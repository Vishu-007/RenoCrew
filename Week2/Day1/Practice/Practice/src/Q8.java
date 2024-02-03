public class Q8 {
    public static void main(String[] args) {
        int [] arr1={1,2,3,4,5,6,7,8,9,10};
        int [] arr2={2,4,6,8,10,12,1};

        boolean isSorted=true;

        for(int i=0;i<arr1.length-1;i++)
        {
            if(arr1[i]>arr1[i+1])
            {
                isSorted=false;
                break;
            }
        }
        System.out.print("Array 1 is Sorted - "+isSorted);

        isSorted=true;
        System.out.println();

        for(int i=0;i<arr2.length-1;i++)
        {
            if(arr2[i]>arr2[i+1])
            {
                isSorted=false;
                break;
            }
        }
        System.out.print("Array 2 is Sorted - "+isSorted);



    }
}
