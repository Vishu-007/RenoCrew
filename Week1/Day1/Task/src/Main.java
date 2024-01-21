import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        System.out.print("Enter your Marks in Subject 1 ");
        float a= s.nextFloat();

        System.out.print("Enter your Marks in Subject 2 ");
        float b= s.nextFloat();

        System.out.print("Enter your Marks in Subject 3 ");
        float c= s.nextFloat();

        System.out.print("Enter your Marks in Subject 4 ");
        float d= s.nextFloat();

        System.out.print("Enter your Marks in Subject 5 ");
        float e= s.nextFloat();

        float total=500;

        float percentage=((a+b+c+d+e)/total)*100;

        System.out.println("Your Marks in %age is "+percentage);
    }
}