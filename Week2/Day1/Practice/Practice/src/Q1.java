//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Q1 {
    public static void main(String[] args) {

        float [] marks = {25.6f,98.5f,85.3f,90f,58.5f};

        float sum=0f;

        for(int i=0;i<marks.length;i++)
        {
            sum+=marks[i];
        }
        System.out.println("The total sum of marks is "+sum);
        }
    }
