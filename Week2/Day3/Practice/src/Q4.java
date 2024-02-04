class Rectangle
{
    int length;
    int breadth;
    int area()
    {
        return length*breadth;
    }
    int perimeter()
    {
        return 2*(length+breadth);
    }
}

public class Q4 {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        rec.length=10;
        rec.breadth=8;

        System.out.println("Area is "+rec.area());
        System.out.println("Perimeter is "+rec.perimeter());
    }
}
