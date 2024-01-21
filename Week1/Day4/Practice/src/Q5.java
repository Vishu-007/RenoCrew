import java.util.Scanner;
public class Q5
{
    public static void main(String[] args) {
        boolean is_leap_year = false;
        System.out.print("Enter year ");
        Scanner s= new Scanner(System.in);
       int year=s.nextInt();
        if (year % 4 == 0) {
            is_leap_year = true;

            if (year % 100 == 0) {

                if (year % 400 == 0)
                    is_leap_year = true;
                else
                    is_leap_year = false;
            }
        }
        else

            is_leap_year = false;

        if (!is_leap_year)
            System.out.println(year + " : Non Leap-year");
        else
            System.out.println(year + " : Leap-year");
    }

}

