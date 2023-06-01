package ARRAYS;

import javax.sql.rowset.RowSetWarning;
import java.util.Arrays;

public class searchIn2DArray {
    public static void main(String[] args) {
        int arr [][] = {
                {12,11,3,34},
                {5,65,4},
                {13,4,7,8},
                {18,12}
        };
        int target = 8;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] search(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col <arr[row].length ; col++) {
                if(arr[row][col] == target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
