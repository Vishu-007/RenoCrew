import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);
        System.out.print("Enter Number of rows you want ");
        int n= s.nextInt();
        for(int i=0; i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}