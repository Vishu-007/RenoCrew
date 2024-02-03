import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter the nth number ");
        int n= s.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum+=i;
        }
        System.out.print("Sum of first N natural number is "+sum);
    }
}
