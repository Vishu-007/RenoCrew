import java.util.Scanner;
public class Q7 {
    static void pattern(int n) {
        if (n > 0) {
            pattern(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter Number of rows you want ");
        int n= s.nextInt();
        pattern(n);
    }
}
