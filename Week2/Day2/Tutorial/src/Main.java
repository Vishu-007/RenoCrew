//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    static int add(int x,int y)
    {
        return x+y;
    }
     static int sum(int x,int y)
    {
        return x+y;
    }

    static int add(int ...a)   // a becomes array of arguments this is the syntax (...) for variable arguments
    {
        int res=0;
        for(int i:a)
        {
            res+=i;
        }
        return res;
    }

    public static void main(String[] args) {

        // A method is a function written inside a class
        //Static Method m bs static method hi call kr skte h bina object bnae
        // agr hmne function ke sath static ni use kiya to hme phele class ka object bnana pdega jisme
        // function h nd fir function call krna pdega
        // Ek se jada static methods ho skte h ek class k
        // Agr method static ho tbh bhi object create krke call kr skte h method

        int x=5;
        int y=10;

        int ans1= add(x,y);

        Main obj = new Main();
        int ans2 = obj.sum(x,y);

        System.out.println(ans1);
        System.out.println(ans2);

        // Values are passed as values
        // For arrays and other objects reference is passed (reference is copied only not the whole object)

        // Method Overloading - Methods having same name but having different number of parameters
        // Method ovelapping doesnot happen by changing the return type

        //parameter - jo function defining ke tym variables hote h
        // Argument - jo function calling k tym variable pass hote h ( Arguments are Actual)

        // Variable Arguments

        System.out.println("Sum of the numbers is "+add(2,3));
        System.out.println("Sum of the numbers is "+add(2,3,4));
        System.out.println("Sum of the numbers is "+add(2,3,4,5,6,7));

    }
}