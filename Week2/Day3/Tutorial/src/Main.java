//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

class pdhai
{
    String name;
    int number;
}
public class Main {
    public static void main(String[] args) {


        // Ek java file m sirf ek hi public class ho skti h
        System.out.println("This is a custom class");

        // Instantisation
        pdhai krlo = new pdhai();

        // setting Attributes
        krlo.name="Vishwas";
        krlo.number=10;

        System.out.print("krlo ka name h "+krlo.name+" krlo ke number h "+krlo.number);
    }
}