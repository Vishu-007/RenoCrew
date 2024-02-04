class Square
{
    int length;
    int area()
    {
        return length*length;
    }
    int perimeter()
    {
        return 4*length;
    }
}

public class Q3 {
    public static void main(String[] args) {
       Square rec = new Square();
        rec.length=10;

        System.out.println("Area is "+rec.area());
        System.out.println("Perimeter is "+rec.perimeter());
    }
}
