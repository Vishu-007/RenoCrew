public class Q3 {
    public static void main(String[] args) {

        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>", "Bahubali");
        System.out.println(letter);

    }
}
