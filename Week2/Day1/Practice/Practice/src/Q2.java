public class Q2 {
    public static void main(String[] args) {
        float [] marks = {25.6f,98.5f,85.3f,90f,58.5f};
        boolean ispresent=false;
        for(int i=0;i<marks.length;i++)
        {
            if(marks[i]==90)
            {
                ispresent=true;
                break;
            }
        }
        System.out.println("Element is present - "+ispresent);
    }
}
