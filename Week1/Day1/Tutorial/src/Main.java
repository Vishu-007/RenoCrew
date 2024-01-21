import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Program to add 3 numbers

        int a=2;
        int b=45;
        int c=74;

        int add=a+b+c;
        System.out.println("Sum is "+add);

        Scanner s= new Scanner(System.in);

        System.out.print("Enter First Number ");
        int first = s.nextInt();
        System.out.print("Enter Second number ");
        int second=s.nextInt();
        int ans=first+second;



        System.out.println("Ans is "+ans);

        boolean ba= s.hasNextInt();
        System.out.println(ba);


    }
}