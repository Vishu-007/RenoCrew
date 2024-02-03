public class Q6 {
    static float avg(int ...a)
    {
        int sum=0;
        for(int ele:a)
        {
         sum+=ele;
        }
        float ans=sum/a.length;
        return ans;
    }
    public static void main(String[] args) {
        float ans= avg(10,20,30,40,50,60,70);
        System.out.println("Avg of numbers are "+ans);


    }
}
