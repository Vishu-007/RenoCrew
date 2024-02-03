public class Q3 {
    public static void main(String[] args) {

        float [] marks = {25.6f,98.5f,85.3f,90f,58.5f};
        float avg=0;
        int total_students= marks.length;
        float sum=0;
        for(float ele:marks)
        {
            sum+=ele;
        }
        avg=sum/total_students ;
        System.out.println("Average of marks is "+avg);
    }
}
