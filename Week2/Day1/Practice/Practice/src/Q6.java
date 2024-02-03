public class Q6 {
    public static void main(String[] args) {

        int [] arr ={10,788,20,-9,66,33,-8,14};
        int maxi=-1000000;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>maxi)
            {
                maxi=arr[i];
            }
        }

        System.out.println("Max element of the array is "+maxi);
    }
}
