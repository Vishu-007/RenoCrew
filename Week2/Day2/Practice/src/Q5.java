import java.util.Scanner;
public class Q5 {
    static int fib(int n)
    {
        if(n==0 || n==1)
            return n;

        int ans= fib(n-2)+fib(n-1);
        return ans;
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter the Nth term you want ");
        int n= s.nextInt();

        int ans=fib(n);

        System.out.println("The "+n+" term is "+ans);

    }
}
