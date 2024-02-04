class Circle
{
    int radius;
    double area()
    {
        return Math.PI*radius*radius;
    }
    double perimeter()
    {
        return 2*Math.PI*radius;
    }
}

public class Q6 {
    public static void main(String[] args) {
        Circle rec = new Circle();
        rec.radius=10;

        System.out.println("Area is "+rec.area());
        System.out.println("Perimeter is "+rec.perimeter());
    }
}