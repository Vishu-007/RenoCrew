//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String name="Vishwas Kalra";
        System.out.println(name);
        System.out.print(name);
        System.out.printf("%s",name);



        // Strings are immutable in java and cannot be changed


        int len = name.length();
        System.out.println(len);

        String lstring = name.toLowerCase();
        System.out.println(lstring);

        String ustring = name.toUpperCase();
        System.out.println(ustring);

        String nonTrimmedString = "     Vishwas    ";
        System.out.println(nonTrimmedString);

        String trimmedString = nonTrimmedString.trim();
        System.out.println(trimmedString);


        System.out.println(name.replace('V', 'p'));
        System.out.println(name.replace("a", "ier"));


        System.out.println(name.charAt(4));


    }
}