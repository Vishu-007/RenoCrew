import java.util.Scanner;
public class Q1 {
    static void table(int n)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+" X "+i+" = "+n*i);
        }
    }
    public static void main(String[] args) {

        System.out.print("Enter Number which table you want ");
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        table(n);
    }
}