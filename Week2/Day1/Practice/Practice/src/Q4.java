public class Q4 {
    public static void main(String[] args) {
        int[][] mat1 = {{2, 3, 0},{-6, 2, -8}};
        int[][] mat2 = {{4, 5, 6},{-9, 0, 4}};
        int[][] ans = new int[2][3];

        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[0].length; j++) {
                ans[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[0].length; j++) {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
