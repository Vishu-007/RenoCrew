public class Q2 {
    public static void main(String[] args) {
        char grade = 'C';
        grade = (char)(grade + 8);
        System.out.println("Bhaiya ye to apka nakli grade h - "+grade);
        // Decrypting the grade
        grade = (char)(grade - 8);
        System.out.println("Asli grade to ye wala h - "+grade);
    }
}
