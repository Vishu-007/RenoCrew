import java.util.Scanner;
public class Q3 {
    static int rec(int n,int i)
    {
        if(i>n)
            return 0;

        int sum=i+rec(n,i+1);
        return sum;
    }
    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);
        System.out.print("Enter the nth number ");
        int n= s.nextInt();
        int ans= rec(n,1);
        System.out.print("Sum of first N natural number is "+ans);


    }
}
