public class Q7 {
    public static void main(String[] args) {

        int [] arr ={100,787,204,-9,-66,-33,-8,14};
        int mini=1000000;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<mini)
            {
                mini=arr[i];
            }
        }

        System.out.println("Min element of the array is "+mini);
    }
}
