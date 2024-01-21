//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int a = 10;
        int ba = 57 % a; // Modulo Operator

        // 2. Assignment Operators
        int b = 77;
        b *= 3;
        System.out.println(b);

        // 3. Comparison Operators
        System.out.println(67 <= 6);

        // 4. Logical Operators
        System.out.println(64 > 5 && 64 > 98);
        System.out.println(64 > 5 || 64 > 98);

        // 5. Bitwise Operators
        System.out.println(2 & 3);
        System.out.println(2 ^ 3);


        // Jb precedence equal ho to hum associativity check krenge
        int x = 6;
        int y = 1;
        int k = x * y / 2;   //  3 aaega bcoz phele multiply hoga and fir divide
        System.out.println(k);

    }
}
