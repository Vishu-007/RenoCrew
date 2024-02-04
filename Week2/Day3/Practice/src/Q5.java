
class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running from the enemy");
    }
    public void fire(){
        System.out.println("Firing on the enemy");
    }
}

public class Q5 {
    public static void main(String[] args) {
        Tommy t = new Tommy();
        t.hit();
        t.fire();
        t.run();
    }
}
