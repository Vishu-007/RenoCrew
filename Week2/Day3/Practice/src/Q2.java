import java.util.Scanner;
class CellPhone{
    public void ring(){
        System.out.println("Phone baj rha h...");
    }
    public void vibrate(){
        System.out.println("Phone Vibrate kr rha h...");
    }
    public void callFriend(String name){
        System.out.println("Calling "+name+"...");
    }

}
public class Q2 {
    public static void main(String[] args) {
        CellPhone apple = new CellPhone();
        apple.ring();
        apple.vibrate();
        System.out.println("Whom you want to call ?");
        Scanner s = new Scanner(System.in);
        String name = s.next();

        apple.callFriend(name);



    }
}
