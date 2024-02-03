import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter temp in Celcius ");
        float n= s.nextFloat();
        float faren = (n * 1.8f) + 32f ;
        System.out.println("Temp in Fahrenheit is "+faren);

    }
}
