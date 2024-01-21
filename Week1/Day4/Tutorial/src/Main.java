//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int age = 29;
        if (age>=18)
            System.out.println("Arey app to gaadi chla skte h");

        else{
            System.out.println("Bhaiya Phele bde to ho jao");
        }

        boolean a = true;
        boolean b = false;
        if (a && b){
            System.out.println("hiieee");
        }
        else{
            System.out.println("Byyy");
        }

        String var = "Saurabh";

        switch (var) {
            case "Shubham" -> {
                System.out.println("You are going to become an Adult!");
                System.out.println("You are going to become an Adult!");
                System.out.println("You are going to become an Adult!");
            }
            case "Saurabh" -> System.out.println("You are going to join a Job!");
            case "Vishaka" -> System.out.println("You are going to get retired!");
            default -> System.out.println("Enjoy Your life!");
        }
    }
}