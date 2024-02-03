//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int [] arr= new int[10]; // Initialising of array  arr is the reference to the memory location
       arr[0]=1;
       arr[1]=5;

        System.out.println(arr[4]);
        int [] marks={10,20,30,40,50}; // Java will automatically calculate its size

        System.out.println("Length of array is "+marks.length); // .length is used to calculate the length of array and .length is the property

        // for-each loop

        for(int ele:marks)
        {
            System.out.print(ele+" ");
        }

        // Initialising a 2-D array
        System.out.println("2-D elements are ");
        int [][] flats=new int[2][3];
        flats[0][1]=2;
        flats[0][2]=5;
        flats[1][1]=8;

        for(int []ele:flats)
        {
            for(int j:ele)
            {
                System.out.print(j+" ");
            }
            System.out.println("");
        }

        float [][][] ThreeD = new float[4][5][6]; // 3-D array
    }
}