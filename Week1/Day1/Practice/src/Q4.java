import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.print("Enter Distance in Km ");
        float km=s.nextFloat();
        float miles=km*0.621371f;

        System.out.println("Distance in Miles in "+miles);
;
    }
}
