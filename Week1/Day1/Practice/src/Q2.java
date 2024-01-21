import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        System.out.print("Enter your Marks in Subject 1 ");
        float a= s.nextFloat();

        System.out.print("Enter your Marks in Subject 2 ");
        float b= s.nextFloat();

        System.out.print("Enter your Marks in Subject 3 ");
        float c= s.nextFloat();

        float cgpa=((a+b+c)/30);
        System.out.println("Your cgpa is "+cgpa);




    }
}
