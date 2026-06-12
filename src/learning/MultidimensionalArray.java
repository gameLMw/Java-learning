package learning;

import java.util.Arrays;

public class MultidimensionalArray {
    public static void main(String[] args) {
        /*
        Array.deepToString()
        输出多为数组，输出格式为：[][]
         */
        int[][] a = {{1, 2, 3},
                {4, 5,},
                {6,7, 8, 9}};
        for(int[] i:a){
            for(int j:i){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString( a));
    }
}
