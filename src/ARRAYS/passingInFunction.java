package ARRAYS;

import java.util.Arrays;

public class passingInFunction {
    public static void main(String[] args) {
        int[] nums = {1,3,23,34,2};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void change(int[] arr){
        arr[0] = 99;
    }
}
